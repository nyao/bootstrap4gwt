package com.appspot.bootstrap4gwt.server.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.appspot.bootstrap4gwt.client.service.HelloWorldService;
import com.appspot.bootstrap4gwt.server.meta.PersonMeta;
import com.appspot.bootstrap4gwt.shared.model.Person;


public class HelloWorldServiceImpl implements HelloWorldService {

	static final PersonMeta pm = PersonMeta.get();
	
	@Override
	public int hello(int count) {
		return count + 1;
	}
	
	@Override
	public Person addPerson(Person person) {
		return Datastore.get(pm, Datastore.put(person));
	}
	
	@Override
	public List<Person> getPersons() {
	    return Datastore.query(pm).asList();
	}
}
