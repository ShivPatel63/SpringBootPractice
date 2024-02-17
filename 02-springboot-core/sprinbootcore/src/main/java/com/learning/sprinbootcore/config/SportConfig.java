package com.learning.sprinbootcore.config;

import com.learning.sprinbootcore.common.Coach;
import com.learning.sprinbootcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
