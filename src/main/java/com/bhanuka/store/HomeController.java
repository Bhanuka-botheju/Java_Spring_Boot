package com.bhanuka.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String message;

    String ViewName = ViewName();
    @RequestMapping("/")
    public String index(){
        System.out.println("this is a bhanuka's java " + message);
        return ViewName;
    }

    private String ViewName(){
        return "index.html";
    }
}

