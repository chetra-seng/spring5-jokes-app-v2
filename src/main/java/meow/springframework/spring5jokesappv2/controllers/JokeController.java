package meow.springframework.spring5jokesappv2.controllers;

import meow.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String showJoke(Model model){
        model.addAttribute("jokes", jokeService.getJoke());
        return "index";
    }
}
