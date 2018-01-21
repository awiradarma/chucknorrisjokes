package test.andre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import test.andre.repository.JokeRepository;
import test.andre.services.JokeService;

/**
 * Created by sj62262 on 1/19/18.
 */
@Controller
public class JokeController {

    private JokeService jokeService;
    private JokeRepository jokeRepository;

    public JokeController(JokeService jokeService, JokeRepository jokeRepository) {
        this.jokeService = jokeService;
        this.jokeRepository = jokeRepository;
    }

    @RequestMapping(path = "/")
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
