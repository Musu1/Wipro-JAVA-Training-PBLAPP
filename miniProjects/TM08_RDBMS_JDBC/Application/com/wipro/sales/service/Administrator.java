package com.wipro.sales.service;

import com.wipro.sales.dao.*;
import com.wipro.sales.bean.*;

import java.util.*;

public class Administrator {
	static StockDao sod=new StockDao();
	static SalesDao sad=new SalesDao();
	
	public String insertStock(Product stock) {
		if(stock!=null && stock.getProductName().length()>=2) {
			String productID=sod.generateProductID(stock.getProductName());
			stock.setProductID(productID);
			if(sod.insertStock(stock)==1) {
				return productID;
			}
			else {
				return "Data not valid for insertion";
			}
			
		}
		else {
			return "Data not valid for insertion";
		}
		
	}
	
	public String deleteStock(String ProductID) {
		if(sod.deleteStock(ProductID)==1) {
			return "Deleted";
		}
		else {
			return "Record cannot be deleted";
		}
	}
	
	
	public String insertSales(Sales sales) {
		if(sales==null) {
			return "Object not valid for insertion";
		}
		if(sod.getStock(sales.getProductID())==null) {
			return "Unknown product for sales";
		}
		if(sod.getStock(sales.getProductID()).getQuantityOnHand()<sales.getQuantitySold()) {
			return "Not enough stock on hand for sale";
		}
		if(sales.getSalesDate().before(new Date())) {
			return "Invalid date";
		}
		
		String salesID=sad.generateSalesID(sales.getSalesDate());
		sales.setSalesID(salesID);
		
		if(sad.insertSales(sales)==1) {
			if(sod.updateStock(sales.getProductID(), sales.getQuantitySold())==1) {
				return "Sales record inserted";
			}
			else {
				return "Error";
			}
		}
		else {
			return "Error";
		}
	}
	
	public ArrayList<SalesReport> getSalesReport(){
		return sad.getSalesReport();
	}
}
