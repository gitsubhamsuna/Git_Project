package Java_Class;

import java.util.Set;
import java.util.HashSet;

public class Set_HashSet {

	public static void main(String[] args) {
		Set<Integer> num=new HashSet<Integer>();
		num.add(61);
		num.add(95);
		num.add(86);
		num.add(33);
		num.add(40);
		
		for(int n:num) {
			System.out.println(n);
		}
	}

}
