package com.example.Book_my_show_Application.Controller;

import com.example.Book_my_show_Application.EntryDto.UserEntryDto;
import com.example.Book_my_show_Application.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody UserEntryDto userEntryDto) {

        try {
             userService.addUser(userEntryDto);
            return new ResponseEntity<>( HttpStatus.CREATED);
        }catch (Exception e){
            String response = "User not added";
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
    }
}

