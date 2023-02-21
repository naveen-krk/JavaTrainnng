package exercise2;

public class exp9 {
public static void main(String[] args) {
	//A aa=new A();
	//B bb=new B();
}
}
class A{
	public int a=9;
	protected String str="nk";
	private float f=7.9f;
	A(){
		System.out.println(a + str+f);
	}
}
class B extends A{
	B(){
		System.out.println(a);
	//	System.out.println(f);
		System.out.println(str);
	}
}
