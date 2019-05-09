package com.nursh.dependencyinjection.Controllers;


import com.nursh.dependencyinjection.Services.Greeting;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private Greeting greeting;

    public MyController(Greeting greeting) {
        this.greeting = greeting;
    }

    public void sayHello() {
        greeting.greet();
    }
}
