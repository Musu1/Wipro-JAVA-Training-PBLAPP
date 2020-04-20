public class For5{
    public static void main(String[] args) {
	if(args.length==0){
		System.out.print("Please enter an integer number");}
	else{
        int a=Integer.parseInt(args[0]);
	int flag=1;
	if(a<=1){
	  flag=0;
	  System.out.print(a+" is neither prime nor composite");}
	else if(a<=3){
	  flag=0;
	  System.out.print(a+" is a prime number.");}
	else if(a%2==0 || a%3==0){
	  flag=0;
	  System.out.print(a+" is not a prime number");}
	else{
	  for(int i=5;i*i<=a;i=i+6){
		if(a%i==0 || a%(i+2)==0){
		    flag=0;
	 	     System.out.print(a+" is not a prime number");}
	   }}
	if(flag==1){
	   System.out.print(a+" is a prime number");}
	}    
}
}