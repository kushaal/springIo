package com.academic.beans;

//Java bean class
public class Person {

	//Property
	String message = null; //instance variable

	// construtors
	public Person() {

	}

	public Person(String message) {

		this.message = message;
	}

	// getters + setters

	public void setMessage(String message) {
          
		this.message = message;
		System.out.println("setMessage is called to set message Property Value");
	}

	public String getMessage() {

		return this.message;
	}
	


}
