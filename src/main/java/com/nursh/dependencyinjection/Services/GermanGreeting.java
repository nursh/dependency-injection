package com.nursh.dependencyinjection.Services;

import org.springframework.stereotype.Service;

@Service
public class GermanGreeting implements Greeting {

    public void greet() {
        System.out.println("Guten Tag Daschun");
    }
}
