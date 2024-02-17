package com.learning.sprinbootcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("I am in TrackCoach");
    }
    @Override
    public String getDailyWorkOut() {
        return "You should run very hard for 2 hours";
    }
}
