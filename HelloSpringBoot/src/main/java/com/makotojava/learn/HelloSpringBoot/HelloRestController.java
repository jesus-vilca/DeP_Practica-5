package com.makotojava.learn.HelloSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  @RequestMapping("/hola")
  public String hello() {
    return "Bienvenido a tu página web.";
  }
}