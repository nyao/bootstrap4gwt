package com.appspot.bootstrap4gwt.client.service;

import com.appspot.bootstrap4gwt.shared.model.Login;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {

    void login(String destinationUrl, AsyncCallback<Login> callback);

}
