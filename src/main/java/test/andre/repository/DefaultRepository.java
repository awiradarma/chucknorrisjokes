package test.andre.repository;

/**
 * Created by sj62262 on 1/19/18.
 */
public class DefaultRepository implements JokeRepository {
    @Override
    public String getRandomJoke() {
        return "Hmmm..  nah, not feeling it.";
    }
}
