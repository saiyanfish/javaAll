package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONWriter;

public class JDBCEXERCISE {
	private static String url="jdbc:mysql://localhost:8889/northwind";
	private static Properties prop;
	private static String SQLS="SELECT * FROM ORDERS;";

	public static void main(String[] args) {
		Properties prop =new Properties();
		prop.put("user", "root");prop.put("password", "root");
		try {
			Connection conn =DriverManager.getConnection(url,prop);
			PreparedStatement ptsmt =conn.prepareStatement(SQLS);
			ResultSet RS =ptsmt.executeQuery();
			JSONWriter jw =new JSONStringer().array();
						while(RS.next()==true) {
							String firstName =RS.getString("orderid");
							String lastName =RS.getString("customerid");
							String sum =RS.getString("OrderDate");
							jw.object();
							jw.key("id").value(firstName);
							jw.key("cyid").value(lastName);
							jw.key("date").value(sum);
							jw.endObject();
			}
						jw.endArray();
						System.out.println(jw.toString());

						
						FileOutputStream fo =new FileOutputStream("dir1/rrr.json");
						fo.write(jw.toString().getBytes());
						fo.flush();
						fo.close();
						
						
		} catch (Exception e) {
						e.printStackTrace();
		}
	}

}
