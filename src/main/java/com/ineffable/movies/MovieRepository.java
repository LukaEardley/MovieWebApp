package com.ineffable.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<MovieInformation, ObjectId> { //Talks to the database and gets the info back
    Optional<MovieInformation> findMovieByImdbId(String  imdbId);
}
