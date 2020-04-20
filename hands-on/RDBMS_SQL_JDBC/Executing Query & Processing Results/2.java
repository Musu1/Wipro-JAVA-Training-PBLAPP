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
			
			String sql="SELECT ename,job,sal,comm FROM emp where sal>1000 and sal<2000";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			//use commit; after adding tables in the database from sqlplus
			System.out.println("empno  ename  sal    comm ");
			while(rs.next()) {
				System.out.println(rs.getString("ename")+"  "+rs.getString("job")+"  "+rs.getDouble("sal")+" "+rs.getDouble("comm"));
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
