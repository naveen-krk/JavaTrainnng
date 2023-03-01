package DesignPattern;

public class Singleton {
public static void main(String[] args) {
	Computer obj1=Computer.getInstance();
	Computer obj2=Computer.getInstance();
}
}
class Computer{
	static Computer obj=new Computer();
	private Computer() {
		
	}
	public static Computer getInstance() {
		System.out.println(obj);
		return obj;
	}
}