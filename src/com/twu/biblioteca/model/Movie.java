package com.twu.biblioteca.model;

import java.util.UUID;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class Movie {
//    a name, year, director and movie rating (from 1-10 or unrated)
    private String id;
    private String name;
    private Integer rating;

    public Movie(String name, Integer rating) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
