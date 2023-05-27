import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
//		System.out.println("Enter Message");
//		Scanner sc =new Scanner(System.in);
		String str="Java Is Very Easy";
		String[] spl=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=spl.length-1;i>=0;i--) {
			sb.append(spl[i]);
			sb.append(" ");
		}
		sb.reverse();
		
		System.out.println(sb);
	}

}
