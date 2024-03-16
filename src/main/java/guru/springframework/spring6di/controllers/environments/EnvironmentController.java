package guru.springframework.spring6di.controllers.environments;

import guru.springframework.spring6di.services.environments.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return String.format("You are in environment %s", environmentService.getEnv());
    }
}
