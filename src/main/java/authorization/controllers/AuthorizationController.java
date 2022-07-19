package authorization.controllers;

import authorization.enums.Authorities;
import authorization.models.User;
import authorization.models.UserProfile;
import authorization.services.AuthorizationService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@Controller
@Validated
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid @User UserProfile user) {
        return service.getAuthorities(user);
    }
}
