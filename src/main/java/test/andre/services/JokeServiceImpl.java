package test.andre.services;

import test.andre.repository.ChuckNorrisJokeRepository;
import test.andre.repository.JokeRepository;

/**
 * Created by sj62262 on 1/19/18.
 */
public class JokeServiceImpl implements JokeService{

    private JokeRepository jokeRepository;

    public JokeServiceImpl(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @Override
    public String getJoke() {
        return jokeRepository.getRandomJoke();
    }
}
