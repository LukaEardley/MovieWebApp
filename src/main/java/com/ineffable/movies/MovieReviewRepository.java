package com.ineffable.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieReviewRepository extends MongoRepository<MovieReview, ObjectId> {
}
