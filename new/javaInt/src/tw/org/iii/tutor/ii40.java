package tw.org.iii.tutor;

import java.util.HashMap;
import java.util.Set;

public class ii40 {

	public static void main(String[] args) {
		HashMap<String, Object> map =new HashMap<>();
		map.put("name", "ii");
		map.put("gender", true);
		map.put("age", 18);
		System.out.println(map.get("name"));
		System.out.println("------");
		
		
		Set<String> keys =map.keySet();
		for(String key:keys) {
			System.out.println(map.get(key));
			}
		}

}
