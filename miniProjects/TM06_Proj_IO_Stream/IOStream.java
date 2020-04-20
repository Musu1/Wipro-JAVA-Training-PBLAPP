import java.util.*;
import java.io.*;

public class IOStream{

	public static void main(String[] args) 
			throws IOException, FileNotFoundException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		String filename = "Employee.txt";
		
		FileOutputStream f = new FileOutputStream(filename);
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		FileInputStream fi = new FileInputStream(filename);
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		do {
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				Employee emp = new Employee();
				System.out.print("Enter Employee ID: ");
				emp.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter Employee Name: ");
				emp.setName(sc.nextLine());
				System.out.print("Enter Employee Age: ");
				emp.setAge(sc.nextInt());
				System.out.print("Enter Employee Salary: ");
				emp.setSalary(sc.nextDouble());
				o.writeObject(emp);
				break;
			case 2:
				System.out.println("----Report-----");
				emp = null;
				while (fi.available() > 0) {
					emp = (Employee) oi.readObject();
					System.out.println(emp);
				}
				System.out.println("----End of Report-----");
				break;
			case 3:
				System.out.println("Exiting the System");
			}
		} while (choice != 3);
		
		f.close();
		o.close();
		fi.close();
		oi.close();
		
	}

}


class Employee implements Serializable {
	private int id;
	private String name;
	private int age;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return id + " " + name + " " + age + " " + salary;
	}
	
	
}