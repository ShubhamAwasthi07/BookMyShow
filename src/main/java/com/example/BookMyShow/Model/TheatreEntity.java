package com.example.BookMyShow.Model;

import com.example.BookMyShow.enums.SeatType;
import com.example.BookMyShow.enums.TheaterType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "theaters")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheatreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name" , nullable = false)
    private String name;


    @Column(name = "city" , nullable = false)
    private String city;

    @Column(name = "address" , nullable = false)
    private String address;


    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    @JsonIgnore
    List<ShowEntity> showEntityList;

    TheaterType type;


    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TheatreSeatEntity> theatreSeatEntity;



}
