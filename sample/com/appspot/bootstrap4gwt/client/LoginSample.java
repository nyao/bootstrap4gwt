package com.appspot.bootstrap4gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.RootPanel;

public class LoginSample implements EntryPoint {

    public void onModuleLoad() {
                    RootPanel.get("UserName").add(new InlineLabel("hoge@foo.com"));
                    RootPanel.get("link2loginout").add(new Anchor("signout", "#"));
                    RootPanel.get("UserNameOnBoard").add(new InlineLabel("hoge@foo.com"));
                    Anchor w = new Anchor("signout", "#");
                    w.addStyleName("btn btn-success");
                    RootPanel.get("link2loginoutOnBoard").add(w);
                    
//                    RootPanel.get("UserName").add(new InlineLabel("guest(please signin)"));
//                    RootPanel.get("link2loginout").add(new Anchor("signin", login.loginUrl));
//                    RootPanel.get("UserNameOnBoard").add(new InlineLabel("guest(please signin)"));
//                    Anchor w = new Anchor("signin", login.loginUrl);
//                    w.addStyleName("btn btn-primary");
//                    RootPanel.get("link2loginoutOnBoard").add(w);

    }
}
