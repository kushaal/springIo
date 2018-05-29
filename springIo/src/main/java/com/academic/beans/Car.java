package com.academic.beans;

//Java bean class
public class Car {

	int model_Number;
	String model_Name = null;

	public Car() {

	}

	public Car(int model_Number, String model_Name) {
		super();
		this.model_Number = model_Number;
		this.model_Name = model_Name;
		
		
		System.out.println("Car const called---");
	}

	public Car(String model_Name) {
		super();

		this.model_Name = model_Name;

	}

	public int getModel_Number() {
		return model_Number;
	}

	public void setModel_Number(int model_Number) {
		this.model_Number = model_Number;
		System.out.println("setModel_Number called---");
	}

	public String getModel_Name() {
		return model_Name;
	}

	public void setModel_Name(String model_Name) {
		this.model_Name = model_Name;
		System.out.println("setModel_Name called---");
	}

}
