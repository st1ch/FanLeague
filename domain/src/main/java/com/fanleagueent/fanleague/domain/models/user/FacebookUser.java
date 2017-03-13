package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexeyverbitskiy on 10/20/16.
 */

public class FacebookUser {
    private String id;
    private String email;
    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
