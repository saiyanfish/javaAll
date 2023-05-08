package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import tw.org.iii.myclasses.Bike;

public class JDBC15 {
	private static final String USER ="root";
	private static final String PASSWORD ="root";
	private static final String URL ="jdbc:mysql://localhost:8889/iii";
	private static final String SQL_UPDATE_BIKE="UPDATE MEMBER SET bike=?WHERE ID=? ";
	public static void main(String[] args) {
		Bike bike1 =new Bike();
		bike1.upSpeed();bike1.upSpeed();bike1.upSpeed();bike1.upSpeed();
		System.out.println(bike1);
		Properties prop = new Properties();
		prop.put("user", USER); prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt =conn.prepareStatement(SQL_UPDATE_BIKE);
			pstmt.setObject(1, bike1);
			pstmt.setInt(2, 1);
			if(pstmt.executeUpdate()>0) {
				System.out.println("bike success");
			}else {
				System.out.println("failure");
			}
		}
			
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
