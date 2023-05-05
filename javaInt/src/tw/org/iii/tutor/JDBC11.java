package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import tw.org.iii.myclasses.BCrypt;

public class JDBC11 {
	private static final String USER ="root";
	private static final String PASSWORD ="root";
	private static final String URL ="jdbc:mysql://localhost:8889/iii";
	private static final String SQL_CHPSD="UPDATE member set password=? WHERE account=?";
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Account:");
		String account =scanner.next();
		
		System.out.println("Password:");
		String password =scanner.next();

		Properties prop =new Properties();
		prop.put("user",USER);
		prop.put("password", PASSWORD);
		
		try {
			Connection conn=DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt =conn.prepareStatement(SQL_CHPSD);
			pstmt.setString(1, BCrypt.hashpw(password, BCrypt.gensalt()) );
			pstmt.setString(2, account);
			pstmt.executeUpdate();
			if(pstmt.executeUpdate()>0) {
				System.out.println("Update ok");

			}
			else {
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
