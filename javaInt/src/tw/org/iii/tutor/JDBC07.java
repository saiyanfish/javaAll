package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC07 {

	public static void main(String[] args) {
		Properties prop =new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:8889/iii", prop);
			//select from
			String sql="select * from food";
			Statement stmt =conn.createStatement();
			ResultSet result= stmt.executeQuery(sql);
			while(result.next()) {
			System.out.println(String.format("%-20s:%s", result.getString("NAME"),result.getString("address"))) ; 
			}
			
			result.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
