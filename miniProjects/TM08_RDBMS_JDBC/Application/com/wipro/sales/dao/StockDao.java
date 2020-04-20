package com.wipro.sales.dao;

import com.wipro.sales.bean.*;
import com.wipro.sales.util.DBUtil;

import java.sql.*;

public class StockDao {
	
	public int insertStock(Product stock) {
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="INSERT INTO TBL_STOCK VALUES(?,?,?,?,?)";
		
		try {
			conn=DBUtil.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1,stock.getProductID());
			ps.setString(2, stock.getProductName());
			ps.setInt(3, stock.getQuantityOnHand());
			ps.setDouble(4, stock.getProductUnitPrice());
			ps.setInt(5, stock.getReorderLevel());
			
			if(ps.executeUpdate()==1) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public String generateProductID(String productName) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "SELECT SEQ_PRODUCT_ID.NEXTVAL FROM DUAL";
		
		int SEQ_PRODUCT_ID = 0;
		String out = "";
		
		try {
			conn = DBUtil.getDBConnection();
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			SEQ_PRODUCT_ID = rs.getInt(1);
			
			out += productName.substring(0, 2);
			out += SEQ_PRODUCT_ID;
			
			return out;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int updateStock(String productID, int soldQty) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "UPDATE TBL_STOCK SET Quantity_On_Hand = Quantity_On_Hand - ?"
				+ "WHERE Product_ID = ?";
		
		try {
			conn = DBUtil.getDBConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, soldQty);
			ps.setString(2, productID);
			
			if (ps.executeUpdate() == 1) return 1;
			else return 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public Product getStock(String productID) {
		Connection conn=null;
		PreparedStatement ps=null;
		String sql="SELECT * FROM TBL_STOCK WHERE PRODUCT_ID=?";
		
		try {
			conn=DBUtil.getDBConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, productID);
			
			ResultSet rs=ps.executeQuery();
			
			rs.next();
			Product stock=new Product();
			stock.setProductID(rs.getString(1));
			stock.setProductName(rs.getString(2));
			stock.setQuantityOnHand(rs.getInt(3));
			stock.setProductUnitPrice(rs.getDouble(4));
			stock.setReorderLevel(rs.getInt(5));
			
			return stock;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
		}

	public int deleteStock(String productID) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "DELETE TBL_STOCK WHERE Product_ID = ?";
		
		try {
			conn = DBUtil.getDBConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, productID);
			
			if (ps.executeUpdate() == 1) return 1;
			else return 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
}
