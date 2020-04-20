import java.util.Scanner;

public class inheritance1{
	public static void main(String args[]){
	   Animal a=new Animal();
	   Bird b=new Bird();
	   a.eat();	
	   a.sleep();
	   b.eat();
	   b.sleep();
	   b.fly();
}
}

class Animal{
	public void eat(){
	   System.out.println("Animals likes to eat");
	}
	
	public void sleep(){
	   System.out.println("Animals likes to sleep");
	}
}

class Bird extends Animal{
	public void eat(){
	   System.out.println("Birds likes to eat");
	}
	
	public void sleep(){
	   System.out.println("Birds likes to sleep");
	}
	
	public void fly(){
	   System.out.println("Flying animals are birds");
	}
}