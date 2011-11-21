package com.appspot.bootstrap4gwt.client.service;

import com.appspot.bootstrap4gwt.shared.model.Login;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("service.s3gwt")
public interface LoginService extends RemoteService {

    Login login(String destinationUrl);

}
