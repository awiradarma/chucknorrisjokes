package test.andre.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import test.andre.repository.ChuckNorrisJokeRepository;
import test.andre.repository.DefaultRepository;
import test.andre.repository.JokeRepository;
import test.andre.services.JokeService;
import test.andre.services.JokeServiceImpl;

/**
 * Created by sj62262 on 1/19/18.
 */
@Configuration
public class BeanFactory {

    @Bean
    @Profile("chuck")
    public JokeRepository chuckNorrisJokeRepository() {
        return new ChuckNorrisJokeRepository();
    }

    @Bean
    @Profile({"test","default"})
    public JokeRepository defaultJokeRepository() {
        return new DefaultRepository();
    }

    @Bean
    public JokeService jokeService(JokeRepository jokeRepository) {
        return new JokeServiceImpl(jokeRepository);
    }
}
