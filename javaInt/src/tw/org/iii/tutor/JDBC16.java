package tw.org.iii.tutor;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.org.iii.myclasses.Bike;

public class JDBC16 {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:8889/iii";
	private static final String SQL_QUERT = "select * from member where id=?";

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_QUERT);
			pstmt.setInt(1, 1);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				InputStream in = rs.getBinaryStream("bike");
				ObjectInputStream oinn = new ObjectInputStream(in);
				Object obj = oinn.readObject();
				if (obj instanceof Bike) {
					Bike b2 = (Bike) obj;
					System.out.println(b2);
				} else {
					System.out.println("n bike");
				}
			} else {
				System.out.println("g");
			}
			System.out.println("ok");
		} catch (Exception e) {
		}
	}
}