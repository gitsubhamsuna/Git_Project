
public class ReverseNumber {

	public static void main(String[] args) {
		int n=1245421;
		int sum=n,temp=0;
		while(n!=0) {
			temp=temp*10+n%10;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Palidrome");
		else
			System.out.println("Not Palidrome");
	}

}
