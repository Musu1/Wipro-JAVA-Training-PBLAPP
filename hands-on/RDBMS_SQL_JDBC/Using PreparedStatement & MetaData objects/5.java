package connection;
import java.sql.*;
import java.util.*;
public class connect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sys as SYSDBA", "Muskan123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = 0;
		try {
			rollno = Integer.parseInt(args[0]);
		} catch (Exception e) {}
		
		
		try {			
			
			if (rollno != 0)
				sql = "SELECT * FROM stdnt WHERE rollno = ?";
			else 
				sql = "SELECT * FROM stdnt";
			
			pstmt = conn.prepareStatement(sql);
			if (rollno != 0) pstmt.setInt(1, rollno);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int ROLLNO = rs.getInt("ROLLNO");
				String STUDENTNAME = rs.getString("STUDENTNAME");
				String STANDARD = rs.getString("STANDARD");
				String DATE_OF_BIRTH = rs.getString("DATE_OF_BIRTH");
				double FEES = rs.getDouble("FEES");
				
				System.out.println(ROLLNO + " " + STUDENTNAME + " " + STANDARD + 
						" " + DATE_OF_BIRTH + " " + FEES);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		sc.close();
	}

}