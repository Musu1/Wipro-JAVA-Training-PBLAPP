package com.automobile.fourWheeler;

import com.automobile.*;

public class Logan extends Vehicle{
	int speed;
	String ModelName;
	String OwnerName;
	String RegistrationNumber;
	int gps;
	
	public Logan(int s,String m,String o,String Re,int g) {
		speed=s;
		ModelName=m;
		OwnerName=o;
		RegistrationNumber=Re;
		gps=g;
	}
	public int Speed() {
		return speed;
	}
	
	public int gps() {
		return gps;
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
