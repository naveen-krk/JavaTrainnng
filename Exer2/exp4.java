package Exer2;

public class exp4 {
public static void main(String[] args) {
	try {
		name("karthik");
	}
	catch(WrongNameException ex) {
		System.out.println("Exception caught"+ex);
	}
}
public static void name(String n)throws WrongNameException {
	if(n!="naveen")
		throw new WrongNameException("wrong name");
	else
		System.out.println("Welcome Naveen");
}
}
 class WrongNameException extends Exception {
public WrongNameException(String str) {						
	super(str);
}
}
 class NameList{
	 NameList(){
		 
	 }
 }

