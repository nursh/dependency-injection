package com.nursh.dependencyinjection.Services;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreeting implements Greeting {

    public void greet() {
        System.out.println("English Greeting");
    }
}
