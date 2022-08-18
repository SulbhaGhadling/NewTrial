package PreparedStatmentQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateQueryByPS {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root", "root");
			String sql = "update stud set className = ? where roll = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter new class Name of student: ");
			String className = sc.next();
			System.out.println("Enter  Roll No. of student whose class Name to be updated: ");
			int roll = sc.nextInt();

			ps.setString(1, className);
			ps.setInt(2, roll);
			ps.executeUpdate();
			conn.close();
			System.out.println("Program Executed Successfully.");
		} catch (Exception e) {
			System.out.println(e);
			// e.printStackTrace();
		}
	}
}
