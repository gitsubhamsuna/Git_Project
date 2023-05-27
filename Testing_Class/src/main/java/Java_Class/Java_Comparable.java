package Java_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_Comparable {

	public static void main(String[] args) {
		List<Students> stu=new ArrayList<Students>();
		stu.add(new Students(1,55));
		stu.add(new Students(2,72));
		stu.add(new Students(3,60));
		stu.add(new Students(4,43));
		stu.add(new Students(5,89));
		
		Collections.sort(stu);
		
		for(Students s:stu) {
			System.out.println(s);
		}

	}

}
class Students implements Comparable<Students>{
	int rollno;
	int marks;
	public Students(int rollno,int marks) {
		this.rollno=rollno;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	public int compareTo(Students s1) {
		if(this.marks>s1.marks)
			return 1;
		return -1;
	}
		
}
