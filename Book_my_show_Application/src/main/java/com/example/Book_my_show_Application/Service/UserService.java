package com.example.Book_my_show_Application.Service;

import com.example.Book_my_show_Application.Convertors.UserConvertor;
import com.example.Book_my_show_Application.Entities.UserEntity;
import com.example.Book_my_show_Application.EntryDto.UserEntryDto;
//import lombok.Data;
import com.example.Book_my_show_Application.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class    UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

//        //creating the objects
        //in video 3 the trainer has some changes so just commenting the below lines
//        UserEntity userEntity= UserEntity.builder().age(userEntryDto.getAge())
//                .name(String.valueOf(userEntryDto.getName()))
//                .address(userEntryDto.getAddress()).email(userEntryDto.getEmail())
//                .mobNo(userEntryDto.getMobNo()).build();
        //This is to set all of the attributes in 1 go

      //  userRepository.save(userEntity);
    }
}
