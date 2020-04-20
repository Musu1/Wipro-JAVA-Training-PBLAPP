package inheritance2;

import java.util.Scanner;
public class Employee extends Person {
	double annualSalary;
	int year;
	String NationalInsuranceNumber;
	Employee(){
		annualSalary=0;
		year=0000;
		NationalInsuranceNumber="0";
	}
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your annual Salary ");
		annualSalary=sc.nextDouble();
		System.out.println("Please enter the year employee started to work  ");
		year=sc.nextInt();
		System.out.println("Please enter the National insurance number ");
		NationalInsuranceNumber=sc.next();
	}
	void set() {
		System.out.println("The annual salary of the employee is "+annualSalary);
		System.out.println("The year employee started to work  "+year);
		System.out.println("The National Insurance Number of the employee is "+NationalInsuranceNumber);
	}

}
