package com.ineffable.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired //Lets the framework instantiate the class for us
    private MovieRepository movieRepository;
    public List<MovieInformation> getAllMovies(){
        return movieRepository.findAll();
    }
}
