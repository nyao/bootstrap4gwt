package com.appspot.bootstrap4gwt.shared.model;

import java.io.Serializable;

import com.google.appengine.api.users.User;

@SuppressWarnings("serial")
public class Login implements Serializable {

    public String loginUrl;
    public User user;
    public boolean isUserAdmin;
    public boolean isUserLoggedIn;
    public String logoutUrl;
}
