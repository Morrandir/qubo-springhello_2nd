package qubo.example;

/**
 * Created by Qubo_Song on 1/9/14.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@ImportResource("spring-context.xml")
@ComponentScan("qubo")
@EnableAutoConfiguration
public class ExampleWebApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
        new SpringApplication(ExampleWebApp.class).run();
    }

}