package com.abby.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class UserRegistration {

    private String login;
    private String password;
    private String rePassword;

    public UserRegistration(){}

    public UserRegistration(String login, String password, String rePassword) {
        this.login = login;
        this.password = password;
        this.rePassword = rePassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
