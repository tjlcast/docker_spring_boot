package com.tjlcast.docker_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController
public class App 
{
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World."
                + "<br />Welcome to <a href='http://waylau.com'>tjlcast.com</a></li>";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
