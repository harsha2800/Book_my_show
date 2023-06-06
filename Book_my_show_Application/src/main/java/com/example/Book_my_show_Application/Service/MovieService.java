package com.example.Book_my_show_Application.Service;

import com.example.Book_my_show_Application.Convertors.MovieConvertors;
import com.example.Book_my_show_Application.Entities.MovieEntity;
import com.example.Book_my_show_Application.EntryDto.MovieEntryDto;
import com.example.Book_my_show_Application.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{

        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

        movieRepository.save(movieEntity);

        return "Movie Added successfully";
    }
}
