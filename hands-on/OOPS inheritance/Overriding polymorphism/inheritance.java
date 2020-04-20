import java.util.Scanner;

public class inheritance{
	public static void main(String args[]){
	   Apple a=new Apple();
	   a.eat();
	   a.set();
	   Orange o=new Orange();
	   o.eat();
	   o.set();
}}

class fruit{
	String name;
	String taste;
	int size;
	void eat(){
	   name="fruit";
	   taste="sweet";
	}
	void set(){
	   System.out.println("The name of the fruit is "+name);
	   System.out.println("The taste of the "+name+" is "+taste);
	}
}

class Apple extends fruit{
	void eat(){
	    name="Apple";
	    taste="Sweet";
	}
}

class Orange extends fruit{
	void eat(){
	    name="Orange";
	    taste="Sweet and Sour";
	}
}	   