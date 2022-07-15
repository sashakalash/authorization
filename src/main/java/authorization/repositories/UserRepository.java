package authorization.repositories;

import authorization.enums.Authorities;
import authorization.exceptions.InvalidCredentials;
import authorization.models.UserAutorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private Map<String, UserAutorities> store = new HashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        final var userData = store.get(user);
        if (userData == null) {
            return new ArrayList<>();
        }
        if(!userData.getPassword().equals(password)) {
            throw  new InvalidCredentials("Неверный пароль");
        }
        return userData.getAuthorities();
    }
}
