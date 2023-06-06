package com.example.Book_my_show_Application.Entities;


import com.example.Book_my_show_Application.Genres.Genre;
import com.example.Book_my_show_Application.Genres.Language;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true,nullable = false)
    private String movieName;

   private double ratings;

   private int duration;

   @Enumerated(value = EnumType.STRING)
   private Language language;

   @Enumerated(value = EnumType.STRING)
   private Genre genre;

   //this is parent wrt to shows
   @OneToMany(mappedBy = "movieEntity",cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList = new ArrayList<>();

}
