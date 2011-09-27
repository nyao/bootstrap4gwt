package com.appspot.bootstrap4gwt.client.service;

import java.util.List;

import com.appspot.bootstrap4gwt.shared.model.Person;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloWorldServiceAsync {

    void addPerson(Person person, AsyncCallback<Person> callback);

    void getPersons(AsyncCallback<List<Person>> callback);

	void count(AsyncCallback<Long> callback);

	void getCount(AsyncCallback<Long> callback);

}
