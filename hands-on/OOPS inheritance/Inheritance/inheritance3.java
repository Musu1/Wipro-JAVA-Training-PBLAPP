import java.util.Scanner;

public class inheritance3{
	public static void main(String args[]){
	   Teacher t=new Teacher();
	   t.get();
	   t.set();
	   student s=new student();
	   s.get();
	   s.set();
	   StudentCollege sc=new StudentCollege();
	   sc.get();
	   sc.set();
}}

class person{
	String name;
	String Dateofbirth;
	public void get(){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter the name of the person ");
	    name=sc.next();
	    System.out.println("Please enter the person's date of birth");
	    Dateofbirth=sc.next();
	}
	public void set(){
	    System.out.println("The name of the person is "+name);
	    System.out.println("The Date of birth of the person is "+Dateofbirth);
	}
}

class Teacher extends person{
	int salary;
	String subject;
	public void get(){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter the name of the teacher ");
	    name=sc.next();
	    System.out.println("Please enter the teacher's date of birth");
	    Dateofbirth=sc.next();
	    System.out.println("Please enter the teacher's salary");
	    salary=sc.nextInt();
	    System.out.println("Please enter the subject teacher teaches");
	    subject=sc.next();
	}
	public void set(){
	    System.out.println("The name of the Teacher is "+name);
	    System.out.println("The Date of birth of the teacher is "+Dateofbirth);
	    System.out.println("The salary of the teacher is "+salary);
	    System.out.println("The subject taught by the teacher is  "+subject);
	}
}

class student extends person{
	String studentID;
	public void get(){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter the name of the student ");
	    name=sc.next();
	    System.out.println("Please enter the student's date of birth");
	    Dateofbirth=sc.next();
	    System.out.println("Please enter the student's ID");
	    studentID=sc.next();
	}
	public void set(){
	    System.out.println("The name of the Student is "+name);
	    System.out.println("The Date of birth of the student is "+Dateofbirth);
	    System.out.println("The Student ID is  "+studentID);
	}
}

class StudentCollege extends student{
	String CollegeName;
	String CollegeYear;
	public void get(){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter the name of the student ");
	    name=sc.next();
	    System.out.println("Please enter the student's date of birth");
	    Dateofbirth=sc.next();
	    System.out.println("Please enter the student;s ID");
	    studentID=sc.next();
	    System.out.println("Please enter the college name");
	    CollegeName=sc.next();
	    System.out.println("Please enter the year the student is");
	    CollegeYear=sc.next();
	}
	public void set(){
	    System.out.println("The name of the Student is "+name);
	    System.out.println("The Date of birth of the student is "+Dateofbirth);
	    System.out.println("The studentID is "+studentID);
	    System.out.println("The college name is  "+CollegeName);
	    System.out.println("The college year is "+CollegeYear);
	}
}

