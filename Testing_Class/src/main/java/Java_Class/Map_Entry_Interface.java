package Java_Class;
import java.util.*;
public class Map_Entry_Interface {

	public static void main(String[] args) {
		Map<String,Integer> student=new HashMap<String,Integer>();
		student.put("Sudhanshu", 90);
		student.put("Sumit", 60);
		student.put("Subham", 55);
		
		Set<Map.Entry<String, Integer>> value=student.entrySet();
		
		for(Map.Entry<String, Integer> v:value) {
			System.out.println(v.getKey()+" : "+v.getValue());
//			System.out.println(v.setValue(5));
		}
	}

}
