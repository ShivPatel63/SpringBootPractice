package com.learning.sprinbootcore.common;

import org.springframework.stereotype.Component;

@Component
public class TenniesCoach implements Coach{

    public TenniesCoach(){
        System.out.println("I am in TenniesCoach");
    }
    @Override
    public String getDailyWorkOut() {
        return "Play Tennis for at-least 3 hrs";
    }
}
