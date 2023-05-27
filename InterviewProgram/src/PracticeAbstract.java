import java.util.Arrays;

public class PracticeAbstract {

	public static void main(String[] args) {
		String str="My name is Subham Suna";
		str=str.toLowerCase();
		String temp="";
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(temp.indexOf(ch)==-1) {
				temp=temp+ch;
			}
		}
		System.out.println(temp);
	}

}
 