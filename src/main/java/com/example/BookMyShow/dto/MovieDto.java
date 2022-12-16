package com.example.BookMyShow.dto;


import com.sun.istack.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDto {

    private int id;

    @NotNull
    private String name;

    @NotNull
    private LocalDate releaseDate;
}
