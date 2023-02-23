package Exer2;
public class Exp6 {
	public static void main(String args[]) throws Exception {
		try {
			new DerivedClass();
		}
		catch (NameException e){
			System.out.println(e);
		}
	}
}
class BaseClass{
	BaseClass() throws NameException{
	throw new NameException("Exception has been handled");
	}
}
class DerivedClass extends BaseClass {
	DerivedClass() throws NameException{
		super();
	}
}
class NameException extends Exception{
	NameException(String s){
		super(s);
	}
}