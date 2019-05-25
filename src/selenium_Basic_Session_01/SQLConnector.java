package selenium_Basic_Session_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnector {

	public static void main(String[] args) throws Exception ,SQLException {

		String dbUrl = "jdbc:mysql://localhost:3036/abcd";

		String username = "root";
		String password = "root";

		String query = "select * from employeelist2;";

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(dbUrl, username, password);

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			String id = rs.getString(1);
			String firstname = rs.getString(2);
			String lastname = rs.getString(3);
			String department = rs.getString(4);
			String officecity = rs.getString(5);

			System.out.println(id + "" + firstname + "" + lastname + "" + department + "" + officecity);

		}
		con.close();
	}

}
