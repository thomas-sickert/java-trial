package com.github.dadjokes;

import com.github.dadjokes.model.DadJoke;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

@Service
public class DadJokeService {
    private final Mapper mapper = new DozerBeanMapper();
    private final DadJokeRepository dadJokeRepository;

    public DadJokeService(DadJokeRepository dadJokeRepository) {
        this.dadJokeRepository = dadJokeRepository;
    }

    public DadJoke getDadJoke(Long id) {
        return mapper.map(dadJokeRepository.getById(id), DadJoke.class);
    }
}
