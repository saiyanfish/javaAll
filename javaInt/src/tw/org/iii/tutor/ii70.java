package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class ii70 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/TransService.aspx?UnitId=fNT9RMo8PQRO");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			StringBuffer sb = new StringBuffer();

			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			parseJSON(sb.toString());
			reader.close();
			
			System.out.println("OK");

		} catch (Exception e) {
			System.out.println("gg");
		}
	}
	static void parseJSON(String json){
		JSONArray root =new JSONArray(json);
		for (int i=0 ;i<root.length();i++) {
			JSONObject row = root.getJSONObject(i);
			System.out.println(row.getString("legalname")+":"+row.getString( "legaladdress"));
		}
	}
}


