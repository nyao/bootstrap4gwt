package com.appspot.bootstrap4gwt.client;

import com.appspot.bootstrap4gwt.client.service.LoginService;
import com.appspot.bootstrap4gwt.client.service.LoginServiceAsync;
import com.appspot.bootstrap4gwt.shared.model.Login;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.RootPanel;

public class LoginEntryPoint implements EntryPoint {

    LoginServiceAsync service = GWT.create(LoginService.class);

    public void onModuleLoad() {
        service.login(Window.Location.getHref(), new AsyncCallback<Login>() {
            @Override
            public void onSuccess(Login login) {
                if (login.isUserLoggedIn) {
                    RootPanel.get("UserName").add(new InlineLabel(login.login));
                    RootPanel.get("link2loginout").add(new Anchor("signout", login.logoutUrl));
                    RootPanel.get("UserNameOnBoard").add(new InlineLabel(login.login));
                    Anchor w = new Anchor("signout", login.logoutUrl);
                    w.addStyleName("btn btn-success");
                    RootPanel.get("link2loginoutOnBoard").add(w);
                } else {
                    RootPanel.get("UserName").add(new InlineLabel("guest(please signin)"));
                    RootPanel.get("link2loginout").add(new Anchor("signin", login.loginUrl));
                    RootPanel.get("UserNameOnBoard").add(new InlineLabel("guest(please signin)"));
                    Anchor w = new Anchor("signin", login.loginUrl);
                    w.addStyleName("btn btn-primary");
                    RootPanel.get("link2loginoutOnBoard").add(w);
                }
            }

            @Override
            public void onFailure(Throwable caught) {
                Window.alert(caught.getMessage());
            }
        });
    }
}
