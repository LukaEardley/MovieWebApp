package com.ineffable.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //Lets the framework instantiate the class for us
    private MovieRepository movieRepository;
    public List<MovieInformation> getAllMovies(){ //Gets all movies
        return movieRepository.findAll();
    }
    public Optional<MovieInformation> getSingleMovie(String imdbId){ //Gets a single movie
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
