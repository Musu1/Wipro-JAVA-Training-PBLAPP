package connection;
import java.sql.*;

public class connect {
		public static void main(String args[]) {
			Connection conn=null;
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as SYSDBA","Muskan123");
				System.out.println("Conection established successfully");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}

}
