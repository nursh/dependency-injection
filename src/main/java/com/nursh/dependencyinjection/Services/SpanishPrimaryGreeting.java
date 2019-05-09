package com.nursh.dependencyinjection.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class SpanishPrimaryGreeting implements Greeting {


    public void greet() {
        System.out.println("Como estas No Hablos Pinatas");
    }
}
