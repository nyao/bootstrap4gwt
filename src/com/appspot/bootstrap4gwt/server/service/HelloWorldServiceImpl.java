package com.appspot.bootstrap4gwt.server.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.appspot.bootstrap4gwt.client.service.HelloWorldService;
import com.appspot.bootstrap4gwt.server.meta.CountMeta;
import com.appspot.bootstrap4gwt.server.meta.PersonMeta;
import com.appspot.bootstrap4gwt.shared.model.Count;
import com.appspot.bootstrap4gwt.shared.model.Person;


public class HelloWorldServiceImpl implements HelloWorldService {

	static final CountMeta cm = CountMeta.get();
	static final PersonMeta pm = PersonMeta.get();
	
	@Override
	public Long count() {
		Count counter = getOrCreateCount();
		counter.setCount(counter.getCount() + 1L);
		Datastore.put(counter);
		return counter.getCount();
	}
	
	@Override
	public Long getCount() {
	    Count counter = getOrCreateCount();
		return counter.getCount();
	}
	
	private Count getOrCreateCount() {
		Count counter = Datastore.query(cm).limit(1).asSingle();
		if (counter == null) {
			counter = new Count();
			counter.setCount(0L);
		}
		return counter;
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
