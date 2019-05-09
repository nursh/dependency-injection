package com.nursh.dependencyinjection.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreeting implements Greeting {

    public void greet() {
        System.out.println("Primary Greeting");
    }
}
