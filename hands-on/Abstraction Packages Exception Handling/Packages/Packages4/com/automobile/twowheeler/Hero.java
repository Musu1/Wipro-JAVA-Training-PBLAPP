package com.automobile.twowheeler;

import com.automobile.*;

public class Hero extends Vehicle{
	int speed;
	String ModelName;
	String OwnerName;
	String RegistrationNumber;
	String Radio;
	
	public Hero(int s,String m,String o,String Re,String R) {
		speed=s;
		ModelName=m;
		OwnerName=o;
		RegistrationNumber=Re;
		Radio=R;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void radio() {
		System.out.println("The radio used in the Hero car is "+Radio);
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
