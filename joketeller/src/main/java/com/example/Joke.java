package com.example;

import java.util.Random;

public class Joke {

    private String[] jokes;

    public Joke() {
        jokes = new String[4];
        jokes[0] = "Q: What do you call a programmer from Finland?\nA: Nerdic";
        jokes[1] = "Q: Why do Java developers wear glasses?\nBecause they can't C#";
        jokes[2] = "compilers are like women it does not matter what happened but always you are wrong";
        jokes[3] = "There are 10 kind of people in the world programmers and not programmers";

    }

    public String getJoke() {
        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}