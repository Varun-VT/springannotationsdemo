package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
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
        actor.setAge(50);
        actor.setName("Akshay Kumar");
        actor.setGender("Male");
        return actor;
    }

    @Bean(name = "movieA")
    public Movie movieA(){
        Movie movieA= new Movie();
        movieA.setActor(actor());
        return movieA;
    }


}
