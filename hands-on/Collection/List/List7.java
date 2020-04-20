import java.util.*;

public class List7{
	public static void main(String args[]){
		Vector<Employee> v = new Vector<>();
		v.add(new Employee(1,"Muskan","muskan.agarwal899",40000.0));
		v.add(new Employee(2,"Musu","musu.agarwal899",4000.0));
		v.add(new Employee(3,"MuskanAgarwal","m.agarwal899",400.0));
		Iterator<Employee> it = v.iterator();
		int i=0;
		while (it.hasNext()){
			System.out.println(it.next());
		} 
			
		

	}

}

class Employee {
	int id;
	String name;
	String email;
	Double salary;
	
	public Employee(int id, String name, String email, Double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}	
	

	public String getDetails() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
}