package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationClass.class);
        System.out.println("The first movie I watched is:"+" movieA");
        System.out.println("The actor of this movie was");
        Movie movieA= (Movie) context.getBean("movieA");
        System.out.println(movieA.getActor());


        ((ConfigurableApplicationContext)context).close();

    }
}
