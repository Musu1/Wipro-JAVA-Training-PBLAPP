package com.automobile.fourWheeler;

import com.automobile.*;

public class Ford extends Vehicle {
	int speed;
	String ModelName;
	String OwnerName;
	String RegistrationNumber;
	int temp;
	
	public Ford(int s,String m,String o,String Re,int t) {
		speed=s;
		ModelName=m;
		OwnerName=o;
		RegistrationNumber=Re;
		temp=t;
	}
	public int Speed() {
		return speed;
	}
	
	public int tempControl() {
		return temp;
	}
	
	public String getModelName() {
		return ModelName;
	}
	
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}
	
	public String getOwnerName() {
		return OwnerName;
	}

}
