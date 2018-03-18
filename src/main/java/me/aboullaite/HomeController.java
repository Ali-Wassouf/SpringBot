package me.aboullaite;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class HomeController {

    @GetMapping(value = "/")
    public String index(){ return "Welcome home";}
}
