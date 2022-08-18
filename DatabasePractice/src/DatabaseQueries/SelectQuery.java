package DatabaseQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root",
					"root");
			String sql = "select * from TimeTable";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Day\t\tFirst Slot\t\tSecond Slot\t\tThird Slot");
			while (rs.next()) {
				String day = rs.getString(1);
				String first = rs.getString(2);
				String Second = rs.getString(3);
				String Third = rs.getString(4);
				System.out.println(day + "\t\t" + first + "\t\t" + Second + "\t\t" + Third);
			}
			connection.close();
			System.out.println("Program Executed Successfuly !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
