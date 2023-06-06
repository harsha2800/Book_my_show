package com.example.Book_my_show_Application.Entities;

import jakarta.persistence.*;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;

    private LocalDate showDate;

    private LocalTime showTime;
    private int totalAmount;
    private String ticketId = UUID.randomUUID().toString();
    private String theaterName;

    @JoinColumn
    @ManyToOne
    private UserEntity userEntity;

    //This is child wrt to showentity

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;

}
