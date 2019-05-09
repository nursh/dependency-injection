package com.nursh.dependencyinjection;

import com.nursh.dependencyinjection.Controllers.EnglishController;
import com.nursh.dependencyinjection.Controllers.FrenchPropertyController;
import com.nursh.dependencyinjection.Controllers.GermanController;
import com.nursh.dependencyinjection.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        MyController mc = (MyController) ctx.getBean("myController");
        mc.sayHello();


        // Qualifiers are used when you have multiple instances of an interface
        // they help us determine which instance to use


        // Property Based injection with qualifier
        ctx.getBean(FrenchPropertyController.class).sayHello();

        // Constructor Based injection with qualifier
        ctx.getBean(EnglishController.class).sayHello();

        // Setter Based injection with qualifier
        ctx.getBean(GermanController.class).sayHello();
    }

}
