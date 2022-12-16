package com.example.BookMyShow.Service.Implementation;

import com.example.BookMyShow.Controller.MovieConverter;
import com.example.BookMyShow.Controller.UserConverter;
import com.example.BookMyShow.Model.MovieEntity;
import com.example.BookMyShow.Model.UserEntity;
import com.example.BookMyShow.Repository.MovieRepository;
import com.example.BookMyShow.Repository.UserRepository;
import com.example.BookMyShow.Service.MovieService;
import com.example.BookMyShow.Service.UserService;
import com.example.BookMyShow.dto.MovieDto;
import com.example.BookMyShow.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public void addMovie(MovieDto movieDto){

        MovieEntity movieEntity = MovieConverter.dtoTOEntity(movieDto);
        movieRepository.save(movieEntity);
    }
    @Override
    public MovieDto getMovie(int id) {

        MovieEntity movieEntity = movieRepository.findById(id).get();
        MovieDto movieDto = MovieConverter.entityToDto(movieEntity);
        return movieDto;
    }
}

