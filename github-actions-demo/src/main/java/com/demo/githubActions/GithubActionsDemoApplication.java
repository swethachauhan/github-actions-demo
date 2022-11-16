package com.demo.githubActions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.sql.DataSourceDefinition;

@SpringBootApplication
@RestController
@RequestMapping("/greet")
public class GithubActionsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsDemoApplication.class, args);
    }


    @GetMapping
    ResponseEntity<String> greet(){
        return ResponseEntity.ok("Hello World");
    }



}
