package com.ineffable.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired //Lets the framework instantiate the class for us
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<MovieInformation>> getAllMovies() {
        return new ResponseEntity<List<MovieInformation>>(movieService.getAllMovies(), HttpStatus.OK);
    }
}
