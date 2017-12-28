package com.bian.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bianzy
 * @create 2017-12-22 14:04
 **/
@RestController
@RequestMapping("hello")
public class HelloController {


    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "hello world! - 4";
    }
}
