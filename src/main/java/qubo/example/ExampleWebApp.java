package qubo.example;

/**
 * Created by Qubo_Song on 1/9/14.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("qubo")
@EnableAutoConfiguration
public class ExampleWebApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ExampleWebApp.class, args);

    }

}