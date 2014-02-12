package qubo.example;

/**
 * Created by Qubo_Song on 1/9/14.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

//@ComponentScan("qubo")
@EnableAutoConfiguration
public class ExampleWebApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
        SpringApplication app = ac.getBean(SpringApplication.class);
        //SpringApplication app = new SpringApplication(ExampleWebApp.class);
        app.run();
    }

}