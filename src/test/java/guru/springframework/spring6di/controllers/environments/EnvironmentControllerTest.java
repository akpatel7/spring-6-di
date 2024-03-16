package guru.springframework.spring6di.controllers.environments;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}

@ActiveProfiles({"DEV", "EN"})
@SpringBootTest
class EnvironmentControllerDevTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}

@ActiveProfiles({"QA", "EN"})
@SpringBootTest
class EnvironmentControllerQATest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}

@ActiveProfiles({"UAT", "EN"})
@SpringBootTest
class EnvironmentControllerUATTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}

@ActiveProfiles({"PROD", "EN"})
@SpringBootTest
class EnvironmentControllerProdTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}