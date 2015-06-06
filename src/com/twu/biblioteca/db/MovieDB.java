package com.twu.biblioteca.db;

import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class MovieDB {
    private static List<Movie> movies = new ArrayList<Movie>();
    static{
        movies.add(new Movie("son of Internet",9));
        movies.add(new Movie("father of Internet",6));
        movies.add(new Movie("year of Internet",6));
        movies.add(new Movie("guess",5));
        movies.add(new Movie("good boy",8));
    }

    public static List<Movie> getAll() {
        return movies;
    }
}
