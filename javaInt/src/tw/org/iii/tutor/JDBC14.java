package tw.org.iii.tutor;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;


	public class JDBC14 {
		private static final String USER ="root";
		private static final String PASSWORD ="root";
		private static final String URL ="jdbc:mysql://localhost:8889/iii";
		private static final String SQL_QUERT="select icon from member where id=?";
		public static void main(String[] args) {
			Properties prop = new Properties();
			prop.put("user", USER); prop.put("password", PASSWORD);
			try {
				Connection conn = DriverManager.getConnection(URL, prop);
				PreparedStatement pstmt =conn.prepareStatement(SQL_QUERT);
				pstmt.setInt(1, 1);
				ResultSet rs =pstmt.executeQuery();
				if(rs.next()){
					InputStream in =rs.getBinaryStream("icon");
					FileOutputStream fout =new FileOutputStream("dir2/bos2.png");
					byte[] buf =new byte[64*1024];
					int len =in.read(buf);
//					fout.write(len);
					fout.write(buf, 0, len);
					fout.flush();
					fout.close();
					System.out.println("ok");
				}
				
				
	}
			catch(Exception e) {}
}
}