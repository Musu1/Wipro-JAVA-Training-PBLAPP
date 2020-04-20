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
					System.out.println("Enter fees: ");
					double fees=sc.nextDouble();
					try {
					String sql = "UPDATE stdnt SET fees = ? WHERE rollno = ?";
						ps = conn.prepareStatement(sql);
						ps.setDouble(1, fees);
						ps.setInt(2, rollno);
						if(ps.executeUpdate()==1) {
						System.out.println("Student's fees updates");
						}
						else {
							System.out.println("error");
						}
						
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