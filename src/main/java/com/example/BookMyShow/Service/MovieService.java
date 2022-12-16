package com.example.BookMyShow.Service;

import com.example.BookMyShow.Model.MovieEntity;
import com.example.BookMyShow.dto.MovieDto;

public interface MovieService {

    public void addMovie(MovieDto movieDto);

    public MovieDto getMovie(int id);
}
