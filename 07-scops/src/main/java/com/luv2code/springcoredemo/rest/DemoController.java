package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for dependency injection
    private Coach myCoach;
    private Coach anotherCoach;
    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theCoach,
                               @Qualifier ("cricketCoach") Coach theanotherCoach){
        System.out.println("In Constructor :"+ getClass().getSimpleName());
        myCoach=theCoach;
        anotherCoach=theanotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String chexk(){
        return "Compairing Beans : myCoach==anotherCoach, "+( myCoach==anotherCoach);

    }

}
