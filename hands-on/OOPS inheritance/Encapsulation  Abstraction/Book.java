import java.util.Scanner;
import java.lang.String;

class Book{
	String Name;
	double price;
	int qtyInStock;
	Book(String b,double p,int q){
	  Name=b;
	  this.price=p;
	  qtyInStock=q;
	}
	void setBook(){
	  Scanner s=new Scanner(System.in);
	   System.out.println("Please enter the Authors name");
	   String authorName=s.nextLine();
	   System.out.println("Please enter the Authors email id");
	   String mail=s.nextLine();
	   System.out.println("Please enter the gender of the author");
	   char gender=s.next().charAt(0);
	  System.out.println("The name of the book is "+Name);
	  System.out.println("The price of book is "+price);
	  System.out.println("The quantity in stock is "+qtyInStock);
	  Author a=new Author(authorName,mail,gender);
	  a.details();	  
	}
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter the Books name");
	   String name=sc.nextLine();
	   System.out.println("Please enter the Books price");
	   double p=sc.nextDouble();
	   System.out.println("Please enter the Quantity of books in stock");
	   int q=sc.nextInt();
	   Book b=new Book(name,p,q);
	   b.setBook();
}
}	




class Author{
	String name;
	String mail;
	char gender;
	Author(String a,String m,char g){
	   name=a;
	   mail=m;
	   gender=g;
	 }
	void details(){
	  System.out.println("The name of the Author is "+name);
	  System.out.println("The mail ID of author is "+mail);
	  System.out.println("The gender of author is "+gender);
	}
}
	   	    

