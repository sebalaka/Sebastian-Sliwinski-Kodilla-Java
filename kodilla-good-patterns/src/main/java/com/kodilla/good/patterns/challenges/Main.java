package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieList = movieStore.getMovies();

        String movie = movieList.entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .collect(joining("!"));

        System.out.println(movie);

//        String s = movieList.entrySet()
//                .stream()
//                .map(Object::toString)
//                .collect(joining("&"));
//
//        System.out.println(s);
    }
}


//Streamy wykonaj iterację po poniższej mapie tytułów i wyświetl wszystkie tytuły w jednym ciągu separując je wykrzyknikiem: