package test.andre.repository;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by sj62262 on 1/19/18.
 */
public class ChuckNorrisJokeRepository implements JokeRepository {

    public String getRandomJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
