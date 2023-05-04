package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

public class JSONtest {

	public static void main(String[] args) {
		try {
			URL url =new URL("https://stats.nba.com/stats/leagueLeaders?LeagueID=00&PerMode=PerGame&Scope=S&Season=2022-23&SeasonType=Regular%20Season&StatCategory=PTS");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader bread =new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			StringBuffer sbf =new StringBuffer();
			while((line=bread.readLine())!=null) {
				sbf.append(line);
			}
			parseJSON(sbf.toString());
			bread.close();
		} catch (Exception e) {
			System.out.println(e);
		}

			
	}
	static void parseJSON(String json){
		JSONObject root =new JSONObject(json);
		JSONArray root1=root.getJSONObject("resultSet").getJSONArray("rowSet");
		for(int i=0;i<root1.length();i++) {
		String	name=root1.getJSONArray(i).get(2).toString();
		String	team=root1.getJSONArray(i).get(23).toString();
		System.out.println(String.format("%-25s:%s", name,team));
		}
	}
}