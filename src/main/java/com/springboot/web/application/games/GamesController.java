package com.springboot.web.application.games;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GamesController {

    @RequestMapping("/games")
    public String games(){
    	System.out.println("In the Games Dashboard Controller");
        return "games";
    }
}
