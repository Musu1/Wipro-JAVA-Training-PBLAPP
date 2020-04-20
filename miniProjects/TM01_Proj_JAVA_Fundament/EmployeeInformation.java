import java.util.Scanner;

public class EmployeeInformation{
	public static void main(String args[]){
	String[][] employee={
	   {"1001","Ashish","01/04/2009","e","R&D","2000","8000","3000"},
	   {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
	   {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
	   {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
	   {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
	   {"1006","Suman","01/1/2000","e","Manufacturing","23000","9000","4400"},
	   {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
	 };
	String[][] DA={
	   {"e","Engineer","20000"},
	   {"c","Consultant","32000"},
	   {"k","Clerk","12000"},
	   {"r","Receptionist","15000"},
	   {"m","Manager","40000"},
	 };
	  String id=args[0];
	  int row=-1;
	  String designation="";
	  int row1=0;
	  for(int i=0;i<7;i++){
	     if(id.equals(employee[i][0])){
	       row=i;
	       designation=employee[i][3];
	       break;}
	  }
	  for(int i=0;i<5;i++){
	     if(designation.equals(DA[i][0])){
	       row1=i;
	       break;}
	  }
	 if(row==-1){
	    System.out.println("There is no employee with empid "+id);
	 }
	 else{
	     String Basic=employee[row][5];
	     String HRA=employee[row][6];
	     String IT=employee[row][7];
	     String DD=DA[row1][2];
	     int B=Integer.parseInt(Basic);
	     int H=Integer.parseInt(HRA);
	     int I=Integer.parseInt(IT);
	     int D=Integer.parseInt(DD);
	     int salary=B+H+D-I;
	     System.out.println("Emp No.  Emp Name  Department  Designation  Salary");
	     System.out.println(id+"  "+employee[row][1]+"  "+employee[row][4]+"  "+DA[row1][1]+"  "+salary);	     
	 }
}}
	   