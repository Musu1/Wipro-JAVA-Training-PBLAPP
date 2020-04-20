package bean;


//import java.util.Arrays;

public class Student {
	public String name;
	public int[] marks=new int[3];
	
	public Student() {
		
	}
	
	public Student(String n,int[] m) {
		name=n;
		marks=m;
	}
}
