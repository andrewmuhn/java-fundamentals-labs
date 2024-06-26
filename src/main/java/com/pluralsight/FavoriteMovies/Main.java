package com.pluralsight.FavoriteMovies;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] movieArr = MoviesArray.getMoviesArr();
        Arrays.sort(movieArr);
        System.out.println(Arrays.toString(movieArr));
    }
}
