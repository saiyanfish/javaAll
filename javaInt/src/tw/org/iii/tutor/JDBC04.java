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
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/iii",prop);
			String sql="insert into cust (cname,tel,birthday) values(?,?,?)";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, "brad");
			pstmt.setString(2, "345");
			pstmt.setString(3, "1998-09-02");
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
