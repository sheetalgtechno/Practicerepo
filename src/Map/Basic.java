package Map;

import java.util.HashMap;
import java.util.Map;


public class Basic {
	
	public static void main(String[] args) {
		Map<Integer,String> mapOfStudents = new HashMap<Integer,String>();
		mapOfStudents.put(1,"ABC");
		mapOfStudents.put(2,"PQR");
		mapOfStudents.put(3,"XYZ");
		mapOfStudents.put(null,"MNO");
		mapOfStudents.put(null,"abc");
		String name = mapOfStudents.get(2);
		System.out.println(mapOfStudents);
		System.out.println(name);
		String returnValue = mapOfStudents.put(null, "TMO");
		System.out.println(returnValue);
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Hello",1);
		int value = hm.put("Hello",2);
		value = hm.put("Hello",value);
		hm.put("Hello", value);
		System.out.println(hm.get("Hello"));
	}
}

