package com.appspot.bootstrap4gwt.client;

import com.appspot.bootstrap4gwt.client.ui.Button;
import com.appspot.bootstrap4gwt.client.ui.TextBox;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.RootPanel;

public class LoginSample implements EntryPoint {

    final InlineLabel guest = new InlineLabel("guest");
    final Anchor signout = new Anchor("signout");
    final Anchor signin = new Anchor("signin", "#signin");

    final TextBox userName = new TextBox();
    final Button formSignin = new Button("signin");
    final Button formSignout = new Button("signout");

    public void onModuleLoad() {
        
        RootPanel.get("UserName").add(guest);
        RootPanel.get("link2loginout").add(signin);
        RootPanel.get("UserNameOnBoard").add(userName);
        RootPanel.get("link2loginoutOnBoard").add(formSignin);
        
        formSignin.addClickHandler(new Signin());
        signout.addClickHandler(new Signout());
        formSignout.addClickHandler(new Signout());
    }
    
    private void clear() {
        RootPanel.get("UserName").clear();
        RootPanel.get("link2loginout").clear();
        RootPanel.get("UserNameOnBoard").clear();
        RootPanel.get("link2loginoutOnBoard").clear();
    }

    private final class Signin implements ClickHandler {
        @Override
        public void onClick(ClickEvent event) {
            clear();
            
            RootPanel.get("UserName").add(new InlineLabel(userName.getText()));
            RootPanel.get("link2loginout").add(signout);
            RootPanel.get("UserNameOnBoard").add(new InlineLabel("Logged in as " + userName.getText()));
            RootPanel.get("link2loginoutOnBoard").add(formSignout);
        }
    }

    private final class Signout implements ClickHandler {
        @Override
        public void onClick(ClickEvent event) {
            clear();
            
            RootPanel.get("UserName").add(guest);
            RootPanel.get("link2loginout").add(signin);
            RootPanel.get("UserNameOnBoard").add(userName);
            RootPanel.get("link2loginoutOnBoard").add(formSignin);
        }
    }
}
