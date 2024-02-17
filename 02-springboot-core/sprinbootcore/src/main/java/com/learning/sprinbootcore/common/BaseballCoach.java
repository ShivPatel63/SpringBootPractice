package com.learning.sprinbootcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("I am in BaseballCoach");
    }
    @Override
    public String getDailyWorkOut() {
        return "It is HomeRun !!!";
    }
}
