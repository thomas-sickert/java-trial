package com.github.dadjokes;

import com.github.dadjokes.api.JokesApi;
import com.github.dadjokes.model.DadJoke;
import io.swagger.annotations.ApiParam;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class DadJokesController implements JokesApi {

    private final Mapper mapper = new DozerBeanMapper();

    private final DadJokeRepository dadJokeRepository;

    public DadJokesController(DadJokeRepository dadJokeRepository) {
        this.dadJokeRepository = dadJokeRepository;
    }

    @Override
    public ResponseEntity<DadJoke> getDadJoke(Long id) {
        return ResponseEntity.ok(mapper.map(dadJokeRepository.getById(id), DadJoke.class));
    }
}
