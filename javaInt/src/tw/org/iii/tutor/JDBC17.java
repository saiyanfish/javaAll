package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC17 {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:8889/iii";
	private static final String SQL_QUERY = "select * from cust";

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id=rs.getString("id");
				String cname=rs.getString("cname");
				System.out.printf("%s:%s\n",id,cname);
			}
			System.out.println("--------");
			if(rs.first()) {
				System.out.println("ok");
				rs.absolute(4);
				String id4=rs.getString("id");
				String cname4=rs.getString("cname");
				System.out.printf("%s:%s\n",id4,cname4);
				
				rs.updateString("cname", "new aa");
				rs.updateString("tel", "321");
				rs.updateRow();
				
//				rs.deleteRow();
				System.out.println("-----");
				String id5=rs.getString("id");
				String cname5=rs.getString("cname");
				System.out.printf("%s:%s\n",id5,cname5);
				
				System.out.println("-----");
				
				rs.moveToInsertRow();
				rs.updateString("cname", "bradii");
				rs.updateString("tel", "1234");
				rs.updateString("birthday", "1999-08-07");
				rs.insertRow();
			}else {
				System.out.println("not scroll");
			}
		} catch (Exception e) {
		}
	}
}