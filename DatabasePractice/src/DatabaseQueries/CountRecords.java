package DatabaseQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountRecords {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root",
					"root");
			String sql = "select count(*) from TimeTable";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String day = rs.getString(1);
				System.out.println(day);
				int i =Integer.parseInt(day);
			}
						connection.close();
			System.out.println("Program Executed Successfuly !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
