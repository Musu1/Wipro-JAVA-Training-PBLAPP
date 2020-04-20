
public class AbstractClasses1{
	public static void main(String args[]){
	   ICICIBank i=new ICICIBank();
	   KotMBank k=new KotMBank();
	   System.out.println("The Saving interest rate of ICICI Bank is "+i.getSavingsInterestRate());
	   System.out.println("The Saving interest rate of KotM Bank is "+k.getSavingsInterestRate());
	   System.out.println("The Fixed interest rate of ICICI Bank is "+i.getFixedDepositInterestRate());
	   System.out.println("The Fixed interest rate of KotM Bank is "+k.getFixedDepositInterestRate());
	   GeneralBank g=new KotMBank();
	   System.out.println("The Saving interest rate of KotM Bank is "+g.getSavingsInterestRate());
	   System.out.println("The Fixed interest rate of KotM Bank is "+g.getFixedDepositInterestRate());
	   GeneralBank g1=new ICICIBank();
	   System.out.println("The Saving interest rate of ICICI Bank is "+g1.getSavingsInterestRate());
	   System.out.println("The Fixed interest rate of ICICI Bank is "+g1.getFixedDepositInterestRate());	
}}		

abstract class GeneralBank{
	double Savings;
	double Fixed;
	public abstract double getSavingsInterestRate();
        public abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
	public double getSavingsInterestRate(){
	   Savings=4;
	   return Savings;}
	public double getFixedDepositInterestRate(){
	   Fixed=8.5;
	   return Fixed;}
}

class KotMBank extends GeneralBank{
	public double getSavingsInterestRate(){
	   Savings=6;
	   return Savings;}
	public double getFixedDepositInterestRate(){
	   Fixed=9;
	   return Fixed;}
}

