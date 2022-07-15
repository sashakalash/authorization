package authorization.models;

import authorization.enums.Authorities;

import java.util.List;

public class UserAutorities {
    private String password;
    private List<Authorities> authorities;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }
}
