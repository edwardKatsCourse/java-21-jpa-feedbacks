package com.company;

import com.company.config.JPAConfig;
import com.company.service.RunnerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 */
@Configuration
@ComponentScan("com.company.*")
public class App {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext();
        c.register(App.class);
        c.register(JPAConfig.class);

        c.refresh();

        //Write your code here
        //Напишите тут ваш код

        RunnerService runnerService = c.getBean(RunnerService.class);
        runnerService.run();
    }
}
