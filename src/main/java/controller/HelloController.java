package controller;

import model.Hello;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jaspreet on 9/18/2018.
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello( Hello hello){
        return "your name is "+hello.getName()+" and mobile Number is "+hello.getMobileNumber();
    }
}
