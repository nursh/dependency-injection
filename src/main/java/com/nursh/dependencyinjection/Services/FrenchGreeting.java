package com.nursh.dependencyinjection.Services;

import org.springframework.stereotype.Service;

@Service
public class FrenchGreeting implements Greeting {

    public void greet() {
        System.out.println("Je suis Francais");
    }
}
