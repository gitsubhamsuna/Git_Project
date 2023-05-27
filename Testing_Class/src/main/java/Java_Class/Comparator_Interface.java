package Java_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Comparator_Interface {

	public static void main(String[] args) {
		List<Integer> values=new ArrayList<Integer>();
		values.add(347);
		values.add(471);
		values.add(158);
		values.add(915);
		values.add(693);
		values.add(762);
		
		
//		Comparator<Integer> comimp=new ComparatorImpl();
		
//		Comparator<Integer> comimp=new Comparator<Integer>() 
//		{
//			public int compare(Integer o1,Integer o2) {
//				if(o1%10>o2%10) {
//					return 1;
//				}
//				return -1;
//			}
//		};
		Comparator<Integer> comimp=(o1,o2) -> // Lambda Expression 
		{
				if(o1%100>o2%100) 
					return 1;
				
				return -1;
		};
		
		Collections.sort(values,comimp);
		
//		Collections.sort(values,(o1,o2) -> 
//		{
//					return o1%10>o2%10? 1:-1;
//		});
//		Collections.reverse(values);
		
		for(int i:values) {
			System.out.println(i);
		}
	}

}
