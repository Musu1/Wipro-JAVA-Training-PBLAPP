package connection;
import java.sql.*;
import java.util.*;
public class connect {
		public static void main(String args[]) throws SQLException {
					Scanner sc = new Scanner(System.in);
					Connection conn = null;
					PreparedStatement ps = null;
					
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sys as SYSDBA", "Muskan123");
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					System.out.print("Enter rollno: ");					
					int rollno = sc.nextInt();
					try {
					String sql = "INSERT INTO stdnt_log SELECT * FROM stdnt where rollno=?";
						ps = conn.prepareStatement(sql);
						ps.setInt(1, rollno);
						ps.executeUpdate();
						System.out.println("Student added successfully in stdnt_log");
						sql="DELETE FROM stdnt where rollno=?";
						ps=conn.prepareStatement(sql);
						ps.setInt(1, rollno);
						ps.executeUpdate();
						System.out.println("Student deleted successfully from stdnt");
					}
					catch (SQLException e) {
						e.printStackTrace();
						System.out.println("Error");
						ps.close();
						conn.close();
					}		
					
					sc.close();
				}

			}