import java.util.Scanner;

class Box{
	int width,height,depth;
	Box(int w,int h,int d){
	  width=w;
	  height=h;
	  depth=d;
	}
	void volume(){
	  System.out.println("The volume is "+(width*height*depth));
	}
	public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter the width");
	   int w=sc.nextInt();
	   System.out.println("Please enter the height");
	   int h=sc.nextInt();
	   System.out.println("Please enter the depth");
	   int d=sc.nextInt();
	   Box b=new Box(w,h,d);
	   b.volume();
}
}	  

