package com.example.Book_my_show_Application.Convertors;

import com.example.Book_my_show_Application.Entities.TheaterEntity;
import com.example.Book_my_show_Application.EntryDto.TheaterEntryDto;

public class TheaterConvertors {

    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto) {

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }
}
