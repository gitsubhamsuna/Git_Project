package Java_Class;

public class InnerClass_AnonymousClass {
	public static void main(String[] args) {
		A a=new A() {
			public void show() //@Override the A(Super class method) 
			{ 
				System.out.println("Inner Class");
			}
		};
		a.show();
	}
}
class A{
	public void show() {
		System.out.println("Class A show");
	}
}