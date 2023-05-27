package Java_Class;

import java.util.TreeSet;
import java.util.Set;

public class Set_TreeSet {

	public static void main(String[] args) {
		Set<Integer> num=new TreeSet<Integer>();
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
