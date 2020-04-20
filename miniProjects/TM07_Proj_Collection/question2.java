import java.util.*;

public class question2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		operations o=new operations();
		int choice=0;
		String item;
		while(true){
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5.Exit");
			choice=sc.nextInt();
			sc.nextLine();
		
			switch(choice){
				case 1:
					System.out.print("Enter the item to be inserted: ");
					if (o.insert(sc.nextLine()))
						System.out.println("Inserted successfully.");
					else
						System.out.println("Already exists.");
					break;
				
				case 2:
					System.out.print("Enter the item to search: ");
					if (o.search(sc.nextLine()))
						System.out.println("Item found in the list.");
					else
						System.out.println("Item not found in the list.");
					break;
				
				case 3:
					System.out.print("Enter the item to delete: ");
					if (o.delete(sc.nextLine()))
						System.out.println("Deleted successfully.");
					else
						System.out.println("Item does not exist.");
					break;
				
				case 4:
					System.out.println("The Items in the list are: ");
					o.display();
					break;
				case 5:
					System.out.println("Exiting....");
					System.exit(0);
				default:
					System.out.println("Please enter the richt choice");
				}
		}
}}

class operations{
	ArrayList<String> l= new ArrayList<>();
	
	public boolean insert(String item) {
		if (!l.contains(item)) {
			l.add(item);
			return true;
		}
		
		return false;
	}
	
	public boolean search(String item) {
		if (l.contains(item)) {
			return true;
		}
		
		return false;
	}
	
	public boolean delete(String item) {
		if (l.contains(item)) {
			l.remove(item);
			return true;
		}
		
		return false;
	}
	
	public void display() {
		for (String item : l)
			System.out.println(item);
	}

}