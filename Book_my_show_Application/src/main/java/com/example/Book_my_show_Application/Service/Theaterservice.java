package com.example.Book_my_show_Application.Service;

import com.example.Book_my_show_Application.Convertors.TheaterConvertors;
import com.example.Book_my_show_Application.Entities.TheaterEntity;
import com.example.Book_my_show_Application.Entities.TheaterSeatEntity;
import com.example.Book_my_show_Application.EntryDto.TheaterEntryDto;
import com.example.Book_my_show_Application.Genres.SeatType;
import com.example.Book_my_show_Application.Repository.TheaterSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Theaterservice {

    @Autowired
    TheaterSeatRepository theaterSeatRepository;

    public String addTheater(TheaterEntryDto theaterEntryDto){

        TheaterEntity theaterEntity = TheaterConvertors.convertDtoToEntity(theaterEntryDto);

        List<TheaterSeatEntity> theaterSeatEntityList = createTheaterSeats(theaterEntryDto,theaterEntity);

        return "";
    }

    private List<TheaterSeatEntity> createTheaterSeats(TheaterEntryDto theaterEntryDto, TheaterEntity theaterEntity){

        int noClassicSeats = theaterEntryDto.getClassicSeatsCount();
        int noPremiumSeats = theaterEntryDto.getPremiumSeatsCount();

        List<TheaterSeatEntity> theaterSeatEntityList = new ArrayList<>();

        for(int count = 1; count<=noClassicSeats;count++){

            TheaterSeatEntity theaterSeatEntity = TheaterSeatEntity.builder()
                    .seatType(SeatType.CLASSIC).seatNo(String.valueof(count)+"C")
                    .theaterEntity(theaterEntity).build();

            theaterSeatEntityList.add(theaterSeatEntity);
        }

        //Create the premium Seats
        for(int count=1;count<=noPremiumSeats;count++){

            TheaterSeatEntity theaterSeatEntity = TheaterSeatEntity.builder().
                    seatType(SeatType.PREMIUM).seatNo(count+"P").theaterEntity(theaterEntity).build();

            theaterSeatEntityList.add(theaterSeatEntity);

        }

        theaterSeatRepository.saveAll(theaterSeatEntityList);

        return theaterSeatEntityList;

    }
}
