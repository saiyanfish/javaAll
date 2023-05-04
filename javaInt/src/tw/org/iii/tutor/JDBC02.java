package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02 {

	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/iii","root","root");
			Statement stmt= conn.createStatement();
			String sql ="INSERT INTO cust (cname,tel,birthday) VALUES('AA','123','1999-01-02')";
			if(stmt.execute(sql)) {
				System.out.println("Query");
			}else {
				System.out.println("Update");
			}
			;
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
			
			System.out.println("mysql:iii");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
