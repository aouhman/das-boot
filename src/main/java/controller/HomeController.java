package main.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aouhman on 15/10/2016.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Does Boot, reporting for duty!";
    }

}
