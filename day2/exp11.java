package exercise2;

public class exp11 {
	public static void main(String[] args) {
		C classc=new C(10);
		System.out.println(classc.name);
		
	}

}
class A{
	void A(int A) {
		System.out.println(A);
	}
	
}
class B{
	void B(int B) {
		System.out.println(B);
	}
	
}
class C extends A{
	
	String name="naveen";
	 C(int C) {
		System.out.println("The constructor is"+C);
	}
}
