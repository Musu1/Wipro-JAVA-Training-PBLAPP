package inheritance2;

import java.util.Scanner;
public class Person {
	String name;
	Person(){
		name=" ";
	}
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the name ");
		name=sc.nextLine();
	}
	void set() {
		System.out.println("The name of the person is "+name);
	}
}
