package com.example.Book_my_show_Application.EntryDto;

import com.example.Book_my_show_Application.Genres.Genre;
import com.example.Book_my_show_Application.Genres.Language;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class MovieEntryDto {


    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;
}
