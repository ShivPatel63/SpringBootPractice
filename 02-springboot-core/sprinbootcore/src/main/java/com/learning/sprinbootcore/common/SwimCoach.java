package com.learning.sprinbootcore.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("I am in SwimCoach");
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 1000m as warm up.";
    }
}
