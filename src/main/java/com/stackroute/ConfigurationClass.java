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
        Actor actor= new Actor("Akshay Kumar","Male",50);
        return actor;
    }

    @Bean(name = "actor1")
    public Actor actor1(){
        return new Actor("Daniel Craig" ,"Male",50);
    }

    @Bean(name = "movieA")
    public Movie movieA(){
        Movie movieA= new Movie();
        movieA.setActor(actor());
        return movieA;
    }

    @Bean(name = "movieB")
    public Movie movieB(){
        Movie movie= new Movie();
        movie.setActor(actor1());
        return movie;
    }


}
