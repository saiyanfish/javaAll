package tw.org.iii.myclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class FoodDB {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:8889/iii";
	public static final String SQL_QUERY = "select * from food";
	private Connection conn;
	private ResultSet rs;
	private String[] fieldNames;

	public FoodDB() throws SQLException {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		conn = DriverManager.getConnection(URL, prop);

	}

	public void queryData(String sql) throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		fieldNames = new String[rsmd.getColumnCount()];
		for (int i = 0; i < fieldNames.length; i++) {
			fieldNames[i] = rsmd.getColumnName(i + 1);
		}
	}
	
	public int getRows() {
		try {
			rs.last();
			return rs.getRow();
		} catch (Exception e) {
			return 0;
		}
	}

	public int getCols() {
		return fieldNames.length;
	}

	// 1base
	public String getData(int row, int cols) {
		try {
			rs.absolute(row);
			return rs.getString(fieldNames[cols - 1]);
		} catch (Exception e) {
			return "xx";
		}
	}

	public void updateData(int row, int cols, String aValue) {
		try {
			rs.absolute(row);
			rs.updateString(fieldNames[cols - 1], aValue);
			rs.updateRow();
		} catch (SQLException e) {
		}
	}
	public void delRow(int row) {
	try {
		rs.absolute(row);
		rs.deleteRow();
	} catch (SQLException e) {
	System.out.println(e);
	}
	}
	
	public String[] getHeader() {
		return fieldNames;
	}

}
