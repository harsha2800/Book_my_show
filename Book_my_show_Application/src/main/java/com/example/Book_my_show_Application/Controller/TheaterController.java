package com.example.Book_my_show_Application.Controller;

import com.example.Book_my_show_Application.EntryDto.TheaterEntryDto;
import com.example.Book_my_show_Application.Service.Theaterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    Theaterservice theaterservice;

    public String addTheater(@RequestBody TheaterEntryDto theaterEntryDto){


    }
}
