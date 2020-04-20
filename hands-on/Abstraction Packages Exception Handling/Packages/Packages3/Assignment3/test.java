package Assignment3;

import com.automobile.twowheeler.*;;

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
	}
}
