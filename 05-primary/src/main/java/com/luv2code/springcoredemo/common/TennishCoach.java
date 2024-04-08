package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennishCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhend volley";
    }
}
