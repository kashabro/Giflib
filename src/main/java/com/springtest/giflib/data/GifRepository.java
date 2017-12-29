package com.springtest.giflib.data;

import com.springtest.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
        new Gif("android-explosion", LocalDate.of(2015,2,13), "Kash of Bedfont", false),
        new Gif("ben-and-mike", LocalDate.of(2015,10,30), "SlutJah", true),
        new Gif("book-dominos", LocalDate.of(2015,9,15), "Jaxxx", false),
        new Gif("compiler-bot", LocalDate.of(2015,2,13), "Mokta", true),
        new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Muaqet", false),
        new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Muqta", true)

    );

    public Gif findByName (String name){
        for (Gif gif : ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }
}
