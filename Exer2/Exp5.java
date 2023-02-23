package Exer2;
public class Exp5 {
public static void main(String[] args) {
	name("karthik");
	//Unresolved compilation problem: 
	//Unhandled exception type WrongNameException at Exercisee_2/Exer2.Exp5.main(Exp5.java:4)

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


