package qubo.controllers;

/**
 * Created by Qubo_Song on 1/9/14.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import qubo.example.ExampleFunc1;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class Func1Controller {

    private static final String func1Response = "Hello, World!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/ExampleFunc1")
    public @ResponseBody
    ExampleFunc1 func1() {
        return new ExampleFunc1(counter.incrementAndGet(), func1Response);
    }
}