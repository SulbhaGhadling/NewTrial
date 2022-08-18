package PreparedStatmentQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteQueryByPS {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root", "root");
			String sql = "delete from student where StudID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll No. of student to be deleted: ");
			int studID = sc.nextInt();

			ps.setInt(1, studID);
			ps.execute();
			conn.close();
			System.out.println("Program Executed Successfully.");
		} catch (Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	}
}
