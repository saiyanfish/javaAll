package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC04 {

	public static void main(String[] args) {
		
		try {
			Properties prop =new Properties();
			prop.put("user", "root");prop.put("password", "root");
			String sql="insert into cust (cname,tel,birthday) values(?,?,?)";
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:8889/iii", prop);
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, "brad");ps.setString(2, "077777777");ps.setString(3, "1998-01-01");
			ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
