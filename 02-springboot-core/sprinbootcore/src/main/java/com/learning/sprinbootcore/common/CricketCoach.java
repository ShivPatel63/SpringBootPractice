package com.learning.sprinbootcore.common;

import com.learning.sprinbootcore.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Lazy
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("I am in CricketCoach");
    }

    @PostConstruct
    public void doMyStratupStuff(){
        System.out.println("In doMyStartupStuff function");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff function");
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice for fast bowling for 15 minutes !!!";
    }
}