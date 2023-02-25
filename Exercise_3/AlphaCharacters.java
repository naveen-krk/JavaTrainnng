package Exercise_3;
import java.util.concurrent.Executors;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
public class AlphaCharacters {
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(1);
	Scanner sc=new Scanner(System.in);
	System.out.println("Exter the string");
	String s=sc.next();
	es.execute(()->{
					new CheckCharacters(s);
	});
	es.shutdown();
	}
}
class CheckCharacters{
	static int count=0;
	CheckCharacters(String s){
		String msg=s;
		for(int i=0;i<msg.length();i++) {
			try{countLetter(msg.charAt(i));
			}catch(Exception e) { System.out.println("Exception caught "+e.toString());}
			}
			}
	public static void countLetter(char c)throws NotALetterException{
		if(Character.isAlphabetic(c))
			System.out.println(c+" is a alphabet");
	else {
		throw new NotALetterException(c);
	}
	}
}
class NotALetterException extends Exception{
	public NotALetterException(char c){
	super();	
	}
}	

