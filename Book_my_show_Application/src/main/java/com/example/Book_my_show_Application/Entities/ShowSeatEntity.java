package com.example.Book_my_show_Application.Entities;

import com.example.Book_my_show_Application.Genres.SeatType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "showseats")
public class ShowSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isBooked;

    private int price;  //price of classic seat for that particular show
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;
}
