package com.twu.biblioteca.service;

import com.twu.biblioteca.db.MovieDB;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

import java.util.List;

/**
 * Created by Thoughtworks on 6/6/15.
 */
public class MovieListCommand extends Command {

    @Override
    protected void execute() {
        List<Movie> movies = MovieDB.getAll();
        listMovies(movies);
    }

    private void listMovies(List<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }
}
