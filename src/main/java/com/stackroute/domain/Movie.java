package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;


@Scope("prototype")
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;
    private ApplicationContext applicationContext;
    private static BeanFactory beanFactory;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext= context;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory= beanFactory;
    }

    public static BeanFactory getBeanFactory(){
        return beanFactory;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println(beanName +" bean has been initialized." );
    }


}