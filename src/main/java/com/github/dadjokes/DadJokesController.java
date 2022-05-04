package com.github.dadjokes;

import com.github.dadjokes.api.JokesApi;
import com.github.dadjokes.model.DadJoke;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class DadJokesController implements JokesApi {

    private final DadJokeService dadJokeService;

    public DadJokesController(DadJokeService dadJokeService) {
        this.dadJokeService = dadJokeService;
    }

    @Override
    public ResponseEntity<DadJoke> getDadJoke(Long id) {
        return ResponseEntity.ok(dadJokeService.getDadJoke(id));
    }
}
