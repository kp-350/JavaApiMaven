package com.pkg.Controller;

import java.util.HashMap;
import java.util.Map;

import com.pkg.model.Person;

/**
 * Example DataStore class that provides access to user data.
 * Pretend this class accesses a database.
 */
public class DataStore {

	//Map of names to Person instances.
	private Map<String, Person> personMap = new HashMap<>();
	
	//this class is a singleton and should not be instantiated directly!
	private static DataStore instance = new DataStore();
	public static DataStore getInstance(){
		return instance;
	}

	//private constructor so people know to use the getInstance() function instead
	private DataStore(){
		//dummy data
		personMap.put("Ada", new Person("Ada", "Ada Lovelace was the first programmer.", 1815, null));
		personMap.put("Kevin", new Person("Kevin", "Kevin is the author of HappyCoding.io.", 1986, null));
		personMap.put("Stanley", new Person("Stanley", "Stanley is Kevin's cat.", 2007, null));
		
		personMap.put("Ada", new Person("Ada", "Ada Lovelace was the first programmer.", 1815, "password one"));
		personMap.put("Kevin", new Person("Kevin", "Kevin is the author of HappyCoding.io.", 1986, "password two"));
		personMap.put("Stanley", new Person("Stanley", "Stanley is Kevin's cat.", 2007, "password three"));
	}

	public Person getPerson(String name) {
		return personMap.get(name);
	}

	public void putPerson(Person person) {
		personMap.put(person.getName(), person);
	}
}