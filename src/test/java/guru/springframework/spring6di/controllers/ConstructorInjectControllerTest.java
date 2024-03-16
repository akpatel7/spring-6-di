package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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