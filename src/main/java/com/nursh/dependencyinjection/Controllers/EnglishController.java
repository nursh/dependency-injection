package com.nursh.dependencyinjection.Controllers;

import com.nursh.dependencyinjection.Services.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnglishController {

    private final Greeting greeting;

    public EnglishController(@Qualifier("englishGreeting")Greeting greeting) {
        this.greeting = greeting;
    }

    public void sayHello() {
        greeting.greet();
    }
}
