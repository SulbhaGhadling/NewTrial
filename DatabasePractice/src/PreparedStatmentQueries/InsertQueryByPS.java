package PreparedStatmentQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertQueryByPS {

	public static void main(String[] args) {
		PreparedStatement ps = null;
		Scanner sc;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root", "root");
			String sql = "insert into studentTable(rollNo, Address) values (?, ?)";
			ps = conn.prepareStatement(sql);

			sc = new Scanner(System.in);
			System.out.println("Enter Roll No. of student: ");
			int studID = sc.nextInt();
			System.out.println("Enter Address of student: ");
			String address = sc.next();

			ps.setInt(1, studID);
			ps.setString(2, address);
			ps.executeUpdate();
			
			System.out.println("Program Executed Successfully.");
			conn.close();
		} catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
	}
}
