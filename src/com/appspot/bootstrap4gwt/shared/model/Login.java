package com.appspot.bootstrap4gwt.shared.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Login implements Serializable {

    public String loginUrl;
    public String login;
    public boolean isUserAdmin;
    public boolean isUserLoggedIn;
    public String logoutUrl;
}
