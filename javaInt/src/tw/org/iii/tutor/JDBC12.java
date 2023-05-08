package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.json.JSONStringer;
import org.json.JSONWriter;

public class JDBC12 {
	private static final String USER ="root";
	private static final String PASSWORD ="root";
	private static final String URL ="jdbc:mysql://localhost:8889/northwind";
	public static void main(String args[]) {
		String sql = 
				"select e.FirstName, e.LastName, sum(od.UnitPrice * od.Quantity) `sum` "
				+ "from orders o "
				+ "join employees e on (o.EmployeeID = e.EmployeeID) "
				+ "join `order details` od on (o.OrderID = od.OrderID) "
				+ "GROUP by e.FirstName, e.LastName "
				+ "ORDER by `sum` desc";
			
			Properties prop = new Properties();
			prop.put("user", USER); prop.put("password", PASSWORD);
			try {
				Connection conn = DriverManager.getConnection(URL, prop);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
				JSONStringer js=new JSONStringer();
				JSONWriter jw =js.array();
				
				JSONWriter jws=new JSONStringer().array();
				
				int rank =1;
				while(rs.next()) {
					String firstName =rs.getString("Firstname");
					String lastName =rs.getString("Lastname");
					double sum =rs.getDouble("sum");
					

					jws.object();
					jws.key("rank").value(rank++);
					jws.key("Firstname").value(firstName);
					jws.key("Lasttname").value(lastName);
					jws.key("sum").value(sum);
					jws.endObject();
				}
				jws.endArray();
//				System.out.println(jws.toString());
				FileOutputStream fout =new FileOutputStream(new File("dir1/last.json"));
				fout.write(jws.toString().getBytes());
				fout.flush();
				fout.close();
				FileInputStream fin =new FileInputStream(new File("dir1/last.json"));
				byte[] aa =new byte[1024];
				int len;
				while((len= fin.read(aa))!=-1) {
					System.out.println(new String(aa, 0, len));
				}
				fin.close();
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
	}
}
