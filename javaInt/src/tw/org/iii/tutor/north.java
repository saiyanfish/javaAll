package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;


public class north {

	public static void main(String[] args) {
		File file = new File("dir1/north.json");
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));

			String ss;
			StringBuffer sbf = new StringBuffer();
			while ((ss = br.readLine()) != null) {
				sbf.append(ss);
			}
			parseJSON(sbf.toString());
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	static void parseJSON(String json) {
		JSONArray js = new JSONArray(json);
		for (int i = 0; i < js.length(); i++) {
			JSONObject jsonobj = js.getJSONObject(i);
			String Firstname = jsonobj.getString("Firstname");
			double sum = jsonobj.getDouble("sum");
			System.out.println(Firstname+":"+sum);
		}
	}
}
