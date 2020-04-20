import java.util.Scanner;

class String8{

	public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           } 
	public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please enter the string");
          String s=sc.nextLine();
	  int len=s.length();
	  String rev="";
	  for(int i=0;i<len;i++){
	    if(s.charAt(i)=='*'){
	      rev=charRemoveAt(rev,i-1);
	      rev=charRemoveAt(rev,i+1);
	      }
	    else{
	      rev=rev+s.charAt(i);
	    }
	   }
	  System.out.println(rev);
}


}
	     