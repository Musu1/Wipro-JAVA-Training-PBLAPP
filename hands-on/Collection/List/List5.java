import java.util.*;

public class List5{
	public static void main(String args[]){
	  LinkedList<String> a=new LinkedList<String>();
	  a.add("January");
	  a.add("February");
	  a.add("March");
	  a.add("April");
	  a.add("May");
	  a.add("June");
	  a.add("July");
	  a.add("August");
	  a.add("September");
	  a.add("October");
	  a.add("November");
	  a.add("December");
	  Iterator i=a.iterator();
	  System.out.println("The months in a year are: ");
	  while(i.hasNext()){
	   System.out.println(i.next());}
}}