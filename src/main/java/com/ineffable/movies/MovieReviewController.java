package com.ineffable.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class MovieReviewController {
    @Autowired
    private MovieReviewService reviewService;
    @PostMapping
    public ResponseEntity<MovieReview> createReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<MovieReview>(reviewService.createReview(payload.get("body"), payload.get("imdbId")), HttpStatus.CREATED); //CREATED: 201
    }
}
