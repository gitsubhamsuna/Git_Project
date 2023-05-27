package Java_Project;

import org.testng.annotations.Test;

public class ReverseString {
	@Test
	public void stringReverse() {
		String str="Hello World";
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println(str+" is Reverse :"+temp);
	}

}
