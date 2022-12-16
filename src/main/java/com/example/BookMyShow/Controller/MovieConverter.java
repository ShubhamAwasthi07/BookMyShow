package com.example.BookMyShow.Controller;

import com.example.BookMyShow.Model.MovieEntity;
import com.example.BookMyShow.dto.MovieDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {

    public static MovieEntity dtoTOEntity(MovieDto movieDto){

        return MovieEntity.builder().name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
    }

    public static MovieDto entityToDto(MovieEntity movieEntity){
        return MovieDto.builder().id(movieEntity.getId()).name(movieEntity.getName()).releaseDate(movieEntity.getReleaseDate()).build();
    }
}
