package com.example.chucknorrisjokes.Controller;


import com.example.chucknorrisjokes.Services.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {


    private final ChuckNorrisJokeService chuckNorrisJokeService;

    public ChuckNorrisController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping({"/",""})
    private String getJoke(Model model){

        model.addAttribute("chuck", chuckNorrisJokeService.getJoke());

        return "joke";

    }


    @GetMapping({"/",""})
    private String refreshJoke(Model model){

        model.addAttribute("submit",chuckNorrisJokeService.getJoke());

        return "joke";

    }





}
