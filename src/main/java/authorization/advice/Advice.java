package authorization.advice;

import authorization.exceptions.InvalidCredentials;
import authorization.exceptions.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("authorization")
public class Advice {
    @ExceptionHandler(InvalidCredentials.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String resolveException(InvalidCredentials ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(UnauthorizedUser.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    String resolveException(UnauthorizedUser ex) {
        final var msg = ex.getMessage();
        System.err.println(msg);
        return msg;
    }
}
