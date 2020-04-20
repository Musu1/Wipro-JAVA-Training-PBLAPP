import java.util.Scanner;

class Patient{
	String patientName;
	double height;
	double weight;
	Patient(String name,double h,double w){
	  patientName=name;
	  height=h;
	  weight=w;
	}
	double computeBMI(){
	  return (weight/(height*height));
	}
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter the patients name");
	   String name=sc.nextLine();
	   System.out.println("Please enter the patients height in meters");
	   double height=sc.nextDouble();
	   System.out.println("Please enter the patient width in kg");
	   double weight=sc.nextDouble();
	   Patient p=new Patient(name,height,weight);
	   double BMI=p.computeBMI();
	   System.out.println("The BMI of the patient "+name+" is "+BMI);
}
}	  

