package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBC08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Keyword = ");
		int page = scanner.nextInt();
		int rpp = 10;
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/iii", prop);
			String sql = "select * from food limit ?,?";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select count(*) total from food");
			rs.next();
			int total = rs.getInt("total");
			int pages = (int) Math.ceil(total * 1.0 / rpp);

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (page - 1) * rpp);
			pstmt.setInt(2, rpp);
			ResultSet result = pstmt.executeQuery();
			if (page <= 0 || page > pages)
				throw new MyPageException("Page ERROR");

			while (result.next()) {
				String id = result.getString("id");
				String name = result.getString("name");
				String tel = result.getString("tel");
				System.out.printf("%s:%s:%s\n", id, name, tel);
			}

		} catch (MyPageException e) {
			System.out.println("oops!" + e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class MyPageException extends Exception {
	private String msg;

	public MyPageException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}
}
