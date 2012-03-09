package com.appspot.bootstrap4gwt.server.service;

import com.appspot.bootstrap4gwt.client.service.LoginService;
import com.appspot.bootstrap4gwt.shared.model.Login;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {
    
    private static final long serialVersionUID = 1L;

    @Override
    public Login login(String destinationUrl) {
        UserService service = UserServiceFactory.getUserService();
        
        Login login = new Login();
        login.loginUrl = service.createLoginURL(destinationUrl);
        login.logoutUrl = service.createLogoutURL(destinationUrl);
        login.isUserLoggedIn = service.isUserLoggedIn();
        if (service.isUserLoggedIn()) {
            login.isUserAdmin = service.isUserAdmin();
            login.login = service.getCurrentUser().getEmail();
        } else {
            login.isUserAdmin = false;
        }

        return login;
    }
}
