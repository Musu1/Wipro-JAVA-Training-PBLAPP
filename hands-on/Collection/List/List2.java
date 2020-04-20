import java.io.*;
import java.util.*;

public class List2{
	public static void main(String args[]){
		EmployeeDB emDB=new EmployeeDB();
		Employee e1=new Employee(1,"Muskan","muskan.agarwal899",'F',40000);
		Employee e2=new Employee(2,"Musu","musu.agarwal899",'M',4000);
		Employee e3=new Employee(3,"MuskanAgarwal","m.agarwal899",'F',400);
		emDB.addEmployee(e1);
		emDB.addEmployee(e2);
		emDB.addEmployee(e3);
		for(Employee e:emDB.listAll()){
			System.out.println(e.GetEmployeeDetails());
		}
		
		System.out.println();
		
		emDB.deleteEmployee(2);
		
		for(Employee e:emDB.listAll()){
			System.out.println(e.GetEmployeeDetails());
		}

		System.out.println();

		System.out.println(emDB.showPaySlip(1));
		

}}

class Employee{
	int empId;
	String empName;
	String email;
	char gender;
	float salary;
	
	public Employee(){
		}
	
	public Employee(int empId, String empName, String empEmail, char empGender, float empSalary){
		this.empId=empId;
		this.empName=empName;
		email=empEmail;
		gender=empGender;
		empSalary=salary;
	}

	public String GetEmployeeDetails(){
		return "Employee [empId=" + empId + ", empName=" + empName + ", EmpEmail=" + email 
				+ ", EmpGender=" + gender + ", EmpSalary=" + salary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return email;
	}

	public void setEmpEmail(String empEmail) {
		this.email = empEmail;
	}

	public char getEmpGender() {
		return gender;
	}

	public void setEmpGender(char empGender) {
		gender = empGender;
	}

	public float getEmpSalary() {
		return salary;
	}

	public void setEmpSalary(float empSalary) {
		salary = empSalary;
	}
	
	
}

class EmployeeDB{
	ArrayList<Employee> e=new ArrayList<>();
	
	public boolean addEmployee(Employee em){
		return e.add(em);
	}

	public boolean deleteEmployee(int empId){
		boolean removed=false;
		Iterator<Employee> i=e.iterator();
		while(i.hasNext()){
		  Employee emp=i.next();
		  if(emp.getEmpId() == empId){
			removed=true;
			i.remove();
		  }
		}
		return removed;
	}

	public String showPaySlip(int empId){
		String paySlip="Invalid employee id";
		for(Employee em:e){
		   if(em.getEmpId()==empId){
			paySlip="Pay slip for employee ID "+empId+"is "+em.getEmpSalary();
		   }
		}
		return paySlip;
	}

	public Employee[] listAll(){
		Employee[] empArray = new Employee[e.size()];
		for (int i = 0; i < e.size(); i++)
			empArray[i] = e.get(i);
		return empArray;
	}
	
} 