package connection;
import java.sql.*;

public class DAOClass {
	Connection conn=null;
	PreparedStatement ps=null;
	
	public DAOClass() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as SYSDBA","Muskan123");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean insert(int r,String n,String g,String dob,int fee) {
		String sql="INSERT INTO student values(?,?,?,?,?)";
		try{
			ps=conn.prepareStatement(sql);
		ps.setInt(1,r);
		ps.setString(2,n);
		ps.setString(3,g);
		ps.setString(4,dob);
		ps.setInt(5,fee);
		ps.executeUpdate();
		return true;
		}
		catch(SQLException e) {
			System.out.print(e);
			return false;
		}
	}
	
	
	public boolean delete(int r) {
		String sql = "DELETE student WHERE rollno = ?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, r);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public boolean modify(int r, int fee) {
		String sql = "UPDATE student SET fee = ? WHERE rollno = ?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, fee);
			ps.setInt(2, r);
			ps.executeUpdate();

			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	

	public boolean display(int r) {
		String sql = "SELECT * FROM student WHERE rollno = ?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, r);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			while (rs.next()) {
				StringBuilder sb = new StringBuilder();

				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					String colName = rsmd.getColumnName(i);

					sb.append(rs.getObject(colName));
					if (i != rsmd.getColumnCount()) sb.append(", ");
				}
				System.out.println(sb);
			}

			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	
	public boolean display() {
		String sql = "SELECT * FROM student";

		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			while (rs.next()) {
				StringBuilder sb = new StringBuilder();

				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					String colName = rsmd.getColumnName(i);

					sb.append(rs.getObject(colName));
					if (i != rsmd.getColumnCount()) sb.append(", ");
				}

				System.out.println(sb);
			}

			return true;
		} catch (SQLException e) {
			return false;
		}
	}
}
