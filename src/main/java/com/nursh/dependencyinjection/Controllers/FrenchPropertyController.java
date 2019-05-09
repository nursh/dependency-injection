package com.nursh.dependencyinjection.Controllers;

import com.nursh.dependencyinjection.Services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FrenchPropertyController {

    @Autowired
    @Qualifier("frenchGreeting")
    private Greeting greeting;

    public void sayHello() {
        greeting.greet();
    }

}
