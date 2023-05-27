package Java_Class;

import java.util.Map;
import java.util.HashMap;

public class Map_HashMap {
	public static void main(String[] args) {
		Map<String,Integer> student=new HashMap<String,Integer>();
		student.put("Harshal", 70);
		student.put("Govind", 55);
		student.put("Papu", 99);
		student.put("Muna", 89);
		student.put("Dhira", 66);
		student.put("Govind", 45);
		
		System.out.println(student);
		
		for(String key:student.keySet()) {
			System.out.println(key+" : "+student.get(key));
		}
		
		
	}
}
