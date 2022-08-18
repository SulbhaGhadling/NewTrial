package DatabaseQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableQuery {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchdb16", "root",
					"root");
			String sql = "create table TimeTable (Day varchar(10), First_Slot varchar(15), Second_Slot varchar(15), Third_Slot varchar(15))";
			Statement stmt = connection.createStatement();
			stmt.execute(sql);
			connection.close();
			System.out.println("Program Executed Successfuly !!!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
