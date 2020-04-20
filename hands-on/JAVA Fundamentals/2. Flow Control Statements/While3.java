public class While3{
	public static void main(String args[]){
		int a=5;
		int i=1;
		while(a!=0){
		if(i%2==0 && i%3==0 && i%5==0){
		  System.out.print(i+" ");
		  a--;}
		i++;
		}
}}