package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectControllerTest {

    @Autowired
    ConstructorInjectController constructor;

//    @BeforeEach
//    void setUp() {
//        constructor = new ConstructorInjectController(new GreetingServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(this.constructor.sayHello());
    }
}