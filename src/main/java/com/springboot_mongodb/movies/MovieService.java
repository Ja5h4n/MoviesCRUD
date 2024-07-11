package com.springboot_mongodb.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> AllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> MovieByObjectId(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> MovieByImdbId(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
