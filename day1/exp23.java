package exercisee;

public class exp23 {
	protected int data=12;
	public static void main(String[] args) {
		
		A a=new A();
		a.mani(data);
		
	}

}
 class A{
	void mani(int data) {
		System.out.print(data*2);
	}
}