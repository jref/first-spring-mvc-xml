package ua.com.codespace.springmvc.firstexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloServletController {

    @RequestMapping("/")
    public String helloWorld() {
        System.out.println("Controller invoked");
        return "hello";
    }


}
