package com.udacity.gradle.builditbigger.backend;

import com.example.Joke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Joke joker;

    public MyBean() {
        joker = new Joke();
    }

    public String getData() {
        return joker.getJoke();
    }
}