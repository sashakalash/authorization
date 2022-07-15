package authorization;

import authorization.controllers.AuthorizationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AuthorizationExHandlersApplication {
    private static AuthorizationController authController;

    public static void main(String[] args) {
        final var context = SpringApplication.run(AuthorizationExHandlersApplication.class, args);
        authController = (AuthorizationController) context.getBean(AuthorizationController.class);
    }

}
