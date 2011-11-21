package com.appspot.bootstrap4gwt.server.service;

import com.appspot.bootstrap4gwt.client.service.LoginService;
import com.appspot.bootstrap4gwt.shared.model.Login;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class LoginServiceImpl implements LoginService {
    
    @Override
    public Login login(String destinationUrl) {
        UserService service = UserServiceFactory.getUserService();
        
        Login login = new Login();
        login.loginUrl = service.createLoginURL(destinationUrl);
        login.logoutUrl = service.createLogoutURL(destinationUrl);
        login.user = service.getCurrentUser();
        login.isUserLoggedIn = service.isUserLoggedIn();
        if (service.isUserLoggedIn()) {
            login.isUserAdmin = service.isUserAdmin();
        } else {
            login.isUserAdmin = false;
        }

        return login;
    }
}
