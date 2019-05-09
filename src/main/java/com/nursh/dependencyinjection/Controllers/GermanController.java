package com.nursh.dependencyinjection.Controllers;

import com.nursh.dependencyinjection.Services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GermanController {

    public Greeting greeting;

    @Autowired
    @Qualifier("germanGreeting")
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public void sayHello() {
        greeting.greet();
    }
}
