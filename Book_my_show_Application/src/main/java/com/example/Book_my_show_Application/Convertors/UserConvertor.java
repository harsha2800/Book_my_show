package com.example.Book_my_show_Application.Convertors;

import com.example.Book_my_show_Application.Entities.UserEntity;
import com.example.Book_my_show_Application.EntryDto.UserEntryDto;

public class UserConvertor {

    //Static is kept to avoid calling it via objects/instances
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail()).name(userEntryDto.getName())
                .mobNo(userEntryDto.getMobNo()).build();

        return userEntity;



    }
}
