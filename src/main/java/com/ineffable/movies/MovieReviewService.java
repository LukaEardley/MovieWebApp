package com.ineffable.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class MovieReviewService {
    @Autowired
    private MovieReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;


    public MovieReview createReview(String reviewBody, String imdbId){
        MovieReview review = reviewRepository.insert(new MovieReview(reviewBody));

        mongoTemplate.update(MovieInformation.class)
                .matching(query(where("imdbId").is(imdbId)))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
