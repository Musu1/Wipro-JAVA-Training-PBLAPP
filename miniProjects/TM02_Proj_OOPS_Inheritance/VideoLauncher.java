import java.util.Scanner;
public class VideoLauncher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VideoStore v=new VideoStore();
		int n=0;
		while(true) {
		System.out.println("MAIN MENU\n=========\n1.Add Videos:\n 2.Check Out Video :\n 3.Return Video :\n 4.Receive Rating :\n 5.List Inventory :\n 6.Exit :\n Enter your choice(1..6):");
		n=sc.nextInt();
		String name;
		switch(n) {
			case 1:System.out.println("Enter the name of the video you want to add:");
				   name=sc.next();
				   v.addVideo(name);
				   System.out.println("Video " + name + " added out successfully.");
				   break;
			case 2:System.out.println("Enter the name of video you want to check out:");
				   name=sc.next();
				   v.doCheckout(name);
				   System.out.println("Video \""+name+"\" checked out successfully");
				   break;
			case 3:System.out.println("Enter the video you want to return:");
				   name=sc.next();
				   v.doReturn(name);
				   System.out.println("Video \""+name+"\" returned successfully");
				   break;
			case 4:System.out.println("Enter the video you want to rate:");
			       name=sc.next();
			       System.out.println("Enter the rating of the video: ");
			       int rate=sc.nextInt();
			       v.receiveRating(name, rate);
			       System.out.println("Rating " + rate + " has been mapped to the Video " + name + ".");
			       break;
			case 5:v.listInventory();
					break;
			case 6:System.out.println("Exiting...!! Thanks for using the application");
				   System.exit(0);
			       
		}}
	}

}
