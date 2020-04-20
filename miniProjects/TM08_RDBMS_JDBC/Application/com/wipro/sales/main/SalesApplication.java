package com.wipro.sales.main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.wipro.sales.service.*;
import com.wipro.sales.bean.*;
import java.util.Date;
public class SalesApplication {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		Administrator ad=new Administrator();
		int choice=0;
		do {
			System.out.println("1. Insert Stock");
			System.out.println("2. Delete Stock");
			System.out.println("3. Insert Sales");
			System.out.println("4. View Sales Report");
			System.out.print("Enter your Choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				Product stock = new Product();
				System.out.print("Enter product ID: ");
				stock.setProductID(sc.next());
				System.out.print("Enter product name: ");
				stock.setProductName(sc.next());
				System.out.print("Enter quantity on hand: ");
				stock.setQuantityOnHand(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter product unit price: ");
				stock.setProductUnitPrice(sc.nextDouble());
				System.out.print("Enter product reorder level: ");
				stock.setReorderLevel(sc.nextInt());
				sc.nextLine();
				ad.insertStock(stock);
				break;
			case 2:
				System.out.print("Enter product id to be deleted: ");
				String removeId = sc.next();
				removeId = ad.deleteStock(removeId);
				if (removeId != null) System.out.println(removeId + " removed successfully");
				break;
			case 3:
				Sales sales = new Sales();
				System.out.print("Enter sales id: ");
				sales.setSalesID(sc.next());
				System.out.print("Enter date (dd-mm-yyyy): ");
				String sDate = sc.next();  
			    Date date = new SimpleDateFormat("dd-mm-yyyy").parse(sDate); 
				sales.setSalesDate(date);
				System.out.print("Enter product id: ");
				sales.setProductID(sc.next());
				System.out.print("Enter quantity sold: ");
				sales.setQuantitySold(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter sales price per unit: ");
				sales.setSalesPricePerUnit(sc.nextDouble());
				ad.insertSales(sales);
				break;
			case 4:
				ad.getSalesReport();
				break;
			default:
				System.out.println("Exiting...");
				choice = 0;
				break;
			}
		} while (choice >= 1 && choice <= 4);
		

	}

}
