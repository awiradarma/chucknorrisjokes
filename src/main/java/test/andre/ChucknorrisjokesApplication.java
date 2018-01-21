package test.andre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import test.andre.services.JokeService;

@SpringBootApplication
public class ChucknorrisjokesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ChucknorrisjokesApplication.class, args);
		//JokeService jokeService = (JokeService) ctx.getBean("jokeService");
		//System.out.println(jokeService.getJoke());
	}
}
