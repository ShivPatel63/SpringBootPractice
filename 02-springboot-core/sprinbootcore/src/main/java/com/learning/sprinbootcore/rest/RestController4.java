package com.learning.sprinbootcore.rest;

import com.learning.sprinbootcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController4 {

    // Define a private object for dependency
    private final Coach myCoach;
//    private final Coach anotherCoach;

    // Define a constructor for dependency injection
    @Autowired
    public RestController4( @Qualifier("swimCoach") Coach theCoach
//                            @Qualifier("baseballCoach") Coach theAnotherCoach
    ){
//    public RestController4(Coach theCoach){
        System.out.println("I am in RestController Constructor");
        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/")
    public static String hello(){
        return "Hi Shiv Patel";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkOut();
    }

//    @GetMapping("/check")
//    public String checkingBeans(){
//        return "Comparing both Coach " + (myCoach == anotherCoach);
//    }
}
