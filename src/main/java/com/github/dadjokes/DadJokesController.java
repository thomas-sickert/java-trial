package com.github.dadjokes;

import com.github.dadjokes.api.JokesApi;
import com.github.dadjokes.model.DadJoke;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
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
        try {
            return ResponseEntity.ok(dadJokeService.getDadJoke(id));
        } catch (NotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
