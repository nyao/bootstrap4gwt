package com.appspot.bootstrap4gwt.client.service;

import java.util.List;

import com.appspot.bootstrap4gwt.shared.model.Person;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloWorldServiceAsync {

	void hello(int count, AsyncCallback<Integer> callback);

    void addPerson(Person person, AsyncCallback<Person> callback);

    void getPersons(AsyncCallback<List<Person>> callback);

}
