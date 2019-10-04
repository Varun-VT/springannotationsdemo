package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.stackroute")


public class ConfigurationClass {


    @Bean(name = {"actor", "main"})
    public Actor actor(){
        Actor actor= new Actor();
        return actor;
    }
    @Bean(name = "actor1")
    public Actor actor1(){
        Actor actor= new Actor("The Rock","Male", 50);
        return actor;
    }

    @Bean(name = "movieA")
    @Autowired
    public Movie movieA(Actor actor){
        Movie movieA= new Movie();
        return movieA;
    }

    @Bean(name = "movieB")
    @Autowired
    public Movie movieB(){
        Movie movieA= new Movie();
        movieA.setActor(actor1());
        return movieA;
    }
}
