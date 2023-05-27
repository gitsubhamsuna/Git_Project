
public class Eclinical {
	public static void main(String[] args) {
		String str="My Name Is Subham";
		String spl[]=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=spl.length-1;i>=0;i--){
//			sb.append(" ");
			sb.append(spl[i]);
			sb.append(" ");
		}
//		sb.reverse();
		System.out.println(sb);
	}
}
class Test{
	String sd;
	public void m1(String str) {
		System.out.println("Test : "+str);
	}
}
class Test2 extends Test{
	
	public void m1(String sb) {
		super.m1("Test2 : "+sb);
	}
}