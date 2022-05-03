package com.github.dadjokes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DadJokeRepository extends JpaRepository<DadJokeEntity, Long> {
    DadJokeEntity getById(Long id);
}
