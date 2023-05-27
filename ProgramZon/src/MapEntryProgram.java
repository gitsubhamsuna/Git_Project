import java.util.*;

public class MapEntryProgram {

	public static void main(String[] args) {
		Map<String,Integer> students=new HashMap<>();
		students.put("Subham", 50);
		students.put("Sudhanshu", 35);
		students.put("Sumit", 75);

		Set<Map.Entry<String,Integer>> values=students.entrySet();
		for(Map.Entry<String, Integer> e: values) {
			System.out.println(e.getKey()+" : "+e.getValue());
			e.setValue(1);
		}
	}

}
