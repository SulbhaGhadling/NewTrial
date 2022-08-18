package DatabaseQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root",
					"root");
			String sql = "update TimeTable set Third_Slot='WEKA_Tool' where Day='Friday'";
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(sql);
			connection.close();
			System.out.println("Program Executed Successfuly !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
