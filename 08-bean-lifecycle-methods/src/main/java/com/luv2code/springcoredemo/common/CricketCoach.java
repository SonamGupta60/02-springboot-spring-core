package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor :"+ getClass().getSimpleName());
    }
    // define our init method
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.print(" In doMyStartUpStuff() : "+getClass().getSimpleName() );
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.print(" In doMyCleanUpStuff() : "+getClass().getSimpleName() );
    }

    @Override
    public String getDailyWorkout() {
        return "Pretice fast bowling for 15 minutes.";
    }
}
