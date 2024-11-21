package com.programs;

import java.util.HashMap;
import java.util.Iterator;

public class HowToCreateImmutableClass {

	// Immutable important for keeping original data intact.
	// String buffer and string builder, original data lost.

	// Five rules
	// 1. Class to be final. Cannot be overridden/extended by child class.
	// 2. Fields should be private final. Non static and final type fields can be
	// initialised via constructor only. Since private so no setter method.
	// 3. No setter method due to above reason.
	// 4. Never return original objects from the getter method. Always return clone
	// to avoid original data loss.
	// 5. Constructor should do deep copy not shallow copy. Deep copy means go to
	// every memory index to copy the data.

	private final int id;
	private final String name;

	// we create both of string type, because string guarantees immutability.
	private final HashMap<String, String> testMap;

	public HowToCreateImmutableClass(int id, String name, HashMap<String, String> testMap) {
		super();
		// id and name are shallow copies as they are primitive so we cant do much.
		this.id = id;
		this.name = name;
//		this.testMap = testMap;//let us deep copy this field.
		HashMap<String, String> tempHashMap = new HashMap<>();
		String keyCapture = null; // as we need to use keys for getting the values.

		// also lets get the iterator to iterate over maps.
		// here we pass the original map to iterate over as temporary one we have to
		// fill it up.

		// another way to iterate over map.
		Iterator<String> it1 = testMap.keySet().iterator();

		while (it1.hasNext()) {
			String s11 = it1.next();
			keyCapture = s11;

//lets fill the temporary hash map
			tempHashMap.put(keyCapture, testMap.get(keyCapture));
		}

		// now write this so that values are assigned to class variable.
		this.testMap = tempHashMap;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the testMap
	 */

	// always return the clone of objects so that original data is not lost.
	// primitive types we cant use clone as no clone method like name.clone().
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}

	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<>();
		h1.put("1", "one");
		h1.put("2", "two");

		int id = 10;
		String s22 = "original";

		HowToCreateImmutableClass h33 = new HowToCreateImmutableClass(id, s22, h1);
		int getId = h33.getId();
		String getName = h33.getName();
		HashMap<String, String> getTestMap = h33.getTestMap();

		System.out.println(getId);
		System.out.println(getName);
		System.out.println(getTestMap);

		// lets modify the values and see if the class is still immutable
		// our class is immutable so the original values wont be changed unless we
		// assign them to new variables.

		id = 20;
		s22 = "modified";
		h1.put("34", "tiger");

		// Shallow copy versus deep copy-
		// Deep copy comes in collection and objects. Going to each and every memory and
		// updating it.

		int getIdModified = h33.getId();
		String getNameModified = h33.getName();
		HashMap<String, String> getTestMapModified = h33.getTestMap();

		System.out.println(" <------------> ");
		System.out.println(getIdModified);
		System.out.println(getNameModified);
		System.out.println(getTestMapModified);

	}

}
