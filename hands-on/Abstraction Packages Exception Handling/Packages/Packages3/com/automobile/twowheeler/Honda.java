package com.automobile.twowheeler;

import com.automobile.*;

public class Honda extends Vehicle{
	int speed;
	String ModelName;
	String OwnerName;
	String RegistrationNumber;
	String CDPlayer;
	
	public Honda(int s,String m,String o,String Re,String R) {
		speed=s;
		ModelName=m;
		OwnerName=o;
		RegistrationNumber=Re;
		CDPlayer=R;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void cdplayer() {
		System.out.println("The radio used in the Honda car is "+CDPlayer);
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
