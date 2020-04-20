public class For3{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int flag=1;
		if(a<=1){
		  flag=0;
		  System.out.print("Not prime");}
		else if(a<=3){
		  flag=0;
		  System.out.print("Prime");}
		else if(a%2==0 || a%3==0){
		  flag=0;
		  System.out.print("Not prime");}
		else{
		for(int i=5;i*i<=a;i=i+6){
		   if(a%i==0 || a%(i+2)==0){
			flag=0;
			System.out.print("Not prime");
		}}}
		if(flag==1){
		  System.out.print("Prime");
		}
}}