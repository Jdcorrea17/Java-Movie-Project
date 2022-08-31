package com.movieapp;

import org.springframework.stereotype.Component;
@Component
public class BatmanMovie implements Movie{
    public String getTitle(){
        return "Batman: The Dark Knight";
    }
    public String getMaturityRating(){
        return "PG_13";
    }
    public String getGenre(){
        return "Action";
    }
}
