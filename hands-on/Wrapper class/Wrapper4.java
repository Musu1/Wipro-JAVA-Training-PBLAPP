public class Wrapper4{
	public static void main(String args[]){
	   Employee e=new Employee("Muskan");
	   Employee em=e.clone();
	   em.set("Musu");
	   System.out.println(e.get());
	   System.out.println(em.get());
}}


class Employee implements Cloneable{
	String name;
	public Employee(String n){
	  name=n;
	}
	public String get(){
	  return name;
	}
	public void set(String n){
	  name=n;
	}
	
	public Employee clone(){
	   try{
		return (Employee) super.clone();
	    }
	    catch(CloneNotSupportedException e){
	         System.out.println("Cloning not allowed");
		 return this;
	     }
	}
}
 