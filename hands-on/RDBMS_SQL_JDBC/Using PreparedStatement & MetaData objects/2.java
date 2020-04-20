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
					
					int rollno = 0;
					do {
						System.out.print("Enter rollno: ");
						String rollstr = sc.nextLine();
						
						try {
							rollno = Integer.parseInt(rollstr);
							if (String.valueOf(rollno).length() != 4) rollno = 0;
						} catch (Exception e) {}
					} while (rollno == 0);
					
					String studentName = "";
					boolean lowercasefound;
					do {
						System.out.print("Enter name: ");
						studentName = sc.nextLine();
						
						lowercasefound = false;
						for (int i = 0; i < studentName.length(); i++) {
							if (Character.isLowerCase(studentName.charAt(i))) {
								lowercasefound = true;
								break;
							}
						}
						
					} while (studentName.length() > 20 || lowercasefound);
					
					String standard = "";
					String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
					List<String> list = new ArrayList<>(Arrays.asList(standards));
					do {
						System.out.print("Enter standard: ");
						standard = sc.nextLine();
					} while (!list.contains(standard));

					System.out.print("Enter D.O.B.: ");
					String dob = sc.nextLine();
					
					Double fees = 0.0;
					do {
						System.out.print("Enter fees: ");
						if (sc.hasNextDouble())
							fees = sc.nextDouble();
					} while (fees == 0.0);
					
					
					// inserting data into db
					String sql = "INSERT INTO stdnt VALUES(?, ?, ?, ?, ?)";
					try {
						ps = conn.prepareStatement(sql);
						ps.setInt(1, rollno);
						ps.setString(2, studentName);
						ps.setString(3, standard);
						ps.setString(4, dob);
						ps.setDouble(5, fees);
						ps.executeQuery();
						System.out.println("Student added successfully");
					} catch (SQLException e) {
						e.printStackTrace();
						System.out.println("Error");
						ps.close();
						conn.close();
					}		
					
					sc.close();
				}

			}