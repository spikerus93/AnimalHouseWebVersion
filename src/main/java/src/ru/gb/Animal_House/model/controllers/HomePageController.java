package src.ru.gb.Animal_House.model.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping("/")
    public String HomePage(){
        return "welcome";
    }
}
