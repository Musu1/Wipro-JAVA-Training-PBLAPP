package connection;
import java.sql.*;

public class connect {
		public static void main(String args[]) throws SQLException {
			Connection conn=null;
			Statement stmt;
			ResultSet rs;
			try{
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as SYSDBA","Muskan123");
				System.out.println("Conection established successfully");		
			
			String sql="SELECT empno,ename FROM emp";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			//use commit; after adding tables in the database from sqlplus
			while(rs.next()) {
				System.out.println("empno: "+rs.getInt(1)+",ename:"+rs.getString("ename"));
			}
			
			if(stmt!=null) {
				stmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}

}
