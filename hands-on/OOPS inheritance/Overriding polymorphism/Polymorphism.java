import java.util.Scanner;



public class Polymorphism{  
public static void main(String args[]){  
	Shape s;  
	s=new Rectangle();  
	s.draw(); 
	s.erase(); 
	s=new Circle();  
	s.draw(); 
	s.erase(); 
	s=new Triangle();  
	s.draw(); 
	s.erase(); 
}  
 }

class Shape{  
	void draw(){
	   System.out.println("Drawing");
	}  
	void erase(){
	   System.out.println("Erasing");
	}
}
  
class Rectangle extends Shape{  
	void draw(){
	   System.out.println("Drawing rectangle");
	} 
	void erase(){
	   System.out.println("Erasing rectangle");
	} 
}  

class Circle extends Shape{  
	void draw(){
	   System.out.println("Drawing circle");
	}
	void erase(){
	   System.out.println("Erasing circle");
	}  
}  

class Triangle extends Shape{  
	void draw(){
	   System.out.println("Drawing triangle");
	}  
	void erase(){
	   System.out.println("Erasing triangle");
	}
}  

