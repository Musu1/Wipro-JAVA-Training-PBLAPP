package Assignment3;

import com.automobile.twowheeler.*;
import com.automobile.fourWheeler.*;

public class test {
	public static void main(String args[]) {
		Hero hero = new Hero(90,"Super Splendor","Muskan", "HERO124", "R");
		System.out.println("the Model name is "+hero.getModelName());
		System.out.println("The Owner name is "+hero.getOwnerName());
		System.out.println("The registration number is "+hero.getRegistrationNumber());
		System.out.println("The Speed is "+hero.getSpeed());
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda(110,"Honda City", "Khushboo","Honda456","c");
		System.out.println("the Model name is "+honda.getModelName());
		System.out.println("The Owner name is "+honda.getOwnerName());
		System.out.println("The registration number is "+honda.getRegistrationNumber());
		System.out.println("The Speed is "+honda.getSpeed());
		honda.cdplayer();
		
		System.out.println();
		
		Logan logan = new Logan(110,"Logan City", "Khushboo","Logan789",1);
		System.out.println("the Model name is "+logan.getModelName());
		System.out.println("The Owner name is "+logan.getOwnerName());
		System.out.println("The registration number is "+logan.getRegistrationNumber());
		System.out.println("The Speed is "+logan.Speed());
		System.out.println("The car has gps? "+logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford(110,"Ford city", "Khushboo","Ford012",0);
		System.out.println("the Model name is "+ford.getModelName());
		System.out.println("The Owner name is "+ford.getOwnerName());
		System.out.println("The registration number is "+ford.getRegistrationNumber());
		System.out.println("The Speed is "+ford.Speed());
		System.out.println("The car has temo cintrol? "+ford.tempControl());
	}
}
