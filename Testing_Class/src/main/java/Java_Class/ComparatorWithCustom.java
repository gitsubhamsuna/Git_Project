package Java_Class;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorWithCustom {

	public static void main(String[] args) {
		List<Student> stu=new ArrayList<Student>();
		stu.add(new Student(1,55));
		stu.add(new Student(2,72));
		stu.add(new Student(3,60));
		stu.add(new Student(4,43));
		stu.add(new Student(5,89));
		
		Collections.sort(stu,(s1,s2) ->
		{
			if(s1.marks>s2.marks) return 1;
			
			return -1;
		});
		for(Student s:stu) {
			System.out.println(s);
		}
	}

}

class Student{
	int rollno;
	int marks;
	public Student(int rollno,int marks) {
		this.rollno=rollno;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
		
}
