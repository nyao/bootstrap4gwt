package com.appspot.bootstrap4gwt.client.service;

import java.util.List;

import com.appspot.bootstrap4gwt.shared.model.Person;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("service.s3gwt")
public interface HelloWorldService extends RemoteService {

	int hello(int count);

    Person addPerson(Person person);

    List<Person> getPersons();

}
