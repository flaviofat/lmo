package br.com.lmo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("hello")
    public String test(){
        return ("Hello world");
    }
}