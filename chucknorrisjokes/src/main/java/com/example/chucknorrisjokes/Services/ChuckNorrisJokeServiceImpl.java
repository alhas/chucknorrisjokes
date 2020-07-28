package com.example.chucknorrisjokes.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {

      return chuckNorrisQuotes.getRandomQuote();


    }
}
