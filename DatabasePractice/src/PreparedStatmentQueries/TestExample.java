package PreparedStatmentQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
			sc = new Scanner(System.in);
			System.out.println("Enter Address of student: ");
			String address = sc.next();

			ps.setInt(1, studID);
			ps.setString(2, address);
			ps.execute();

			System.out.println("Program Executed Successfully.");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
