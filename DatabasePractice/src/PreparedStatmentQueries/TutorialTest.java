package PreparedStatmentQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TutorialTest {

	static int cid;
	static String studentName;
	static String courseName;

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String JdbcURL = "jdbc:mysql://localhost:3306/batchdb16";
		String Username = "root";
		String password = "root";
		Connection con = null;
		Scanner keyboardInput = new Scanner(System.in);
		PreparedStatement pstmt = null;
		String query = "insert into studentTable(rollNo, Address) values (?, ?)";
		try {
			con = DriverManager.getConnection(JdbcURL, Username, password);
			System.out.println("Enter the course id:");
			cid = keyboardInput.nextInt();
			System.out.println("Enter the Student Name:");
			studentName = keyboardInput.next();
			//input(keyboardInput);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, cid);
			pstmt.setString(2, studentName);
			// pstmt.setString(3, courseName);
			// int status =
			pstmt.executeUpdate();
//	         if(status > 0) {
//	            System.out.println("Record is inserted successfully !!!");
//	         }
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//
//	public static void input(Scanner keyboardInput) {
//		System.out.println("Enter the course id:");
//		cid = keyboardInput.nextInt();
//		System.out.println("Enter the Student Name:");
//		studentName = keyboardInput.next();
//		System.out.println("Enter the Course Name:");
//		courseName = keyboardInput.next();
//	}
}
