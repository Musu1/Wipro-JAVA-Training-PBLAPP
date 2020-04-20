package com.wipro.sales.dao;

import java.util.*;
import java.sql.*;

import com.wipro.sales.bean.*;
import com.wipro.sales.util.*;


public class SalesDao {
	
	public int insertSales(Sales sales) {
			Connection conn=null;
			PreparedStatement ps=null;
			String sql="Insert into TBL_SQL VALUES(?,?,?,?,?)";
			
			java.sql.Date sqlDate = new java.sql.Date(sales.getSalesDate().getTime());
			
			try {
				conn = DBUtil.getDBConnection();
				ps = conn.prepareStatement(sql);
				ps.setString(1, sales.getSalesID());
				ps.setDate(2, sqlDate);
				ps.setString(3, sales.getProductID());
				ps.setInt(4, sales.getQuantitySold());
				ps.setDouble(5, sales.getSalesPricePerUnit());
				
				if (ps.executeUpdate() == 1) return 1;
				else return 0;
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
	}
	
	
	public String generateSalesID(java.util.Date date) {		
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "SELECT SEQ_SALES_ID.NEXTVAL FROM DUAL";
		
		int SEQ_SALES_ID = 0;
		String out = date.toString().substring(date.toString().length()-2, date.toString().length());
		
		try {
			conn = DBUtil.getDBConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			SEQ_SALES_ID = rs.getInt(1);
			
			out += SEQ_SALES_ID;
			return out;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	public ArrayList<SalesReport> getSalesReport(){
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="SELECT * FROM V_SALES_REPORT";
		
		ArrayList<SalesReport> l=new ArrayList<SalesReport>();
		
		
		try {
			conn=DBUtil.getDBConnection();
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				SalesReport s=new SalesReport();
				s.setSalesID(rs.getString(1));
				s.setSalesDate(rs.getDate(2));
				s.setProductID(rs.getString(3));
				s.setProductName(rs.getString(4));
				s.setQuantitySold(rs.getInt(5));
				s.setProductUnitPrice(rs.getDouble(6));
				s.setSalesPricePerUnit(rs.getDouble(7));
				s.setProfitAmount(rs.getDouble(8));
				l.add(s);
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return l;
		
	}
	
	
	
}
