package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by st1ch on 10.11.2016.
 */

public class GoogleUser {
    private String email;
    private String token;

    public GoogleUser(String email) {
        this.email = email;
    }

    public GoogleUser(String email, String token) {
        this.email = email;
        this.token = token;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
