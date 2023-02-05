package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String addmovie(Movie movie){
        return movieRepository.addMovie(movie);
    }

    public String adddirector(Director director){
        return movieRepository.addDirector(director);
    }

    public Movie getmoviebyname(String name){
        return movieRepository.getmovie(name);
    }

    public Director getdirectorbyname(String name){
        return movieRepository.getdirector(name);
    }

    public String addmoviedirectorPair(String mvName, String dirName){
        return movieRepository.addpair(mvName,dirName);
    }

    public List getallmovies(){
        return movieRepository.getAllMovies();
    }

    public String deleteDirectorByName(String dirName){
        return movieRepository.deleteDirectorByName(dirName);
    }

    public String deleteAllDirectors(){
        return movieRepository.deleteAllDirectors();
    }

    public List getMoviesByDirectorName(String dirName){
        return movieRepository.getMoviesByDirectorName(dirName);
    }

    public String getDirectorByMovieName(String mvName){
        return movieRepository.getDirectorByMovieName(mvName);
    }
}