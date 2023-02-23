package Exer2;
import java.io.FileReader;

public class exp1 {
public static void main(String[] args) {
	IoExceptions exception=new IoExceptionss();
}
}
  class IoExceptions{
 	private void IoException() {
		FileReader fr=new FileReader("test.txt");
		System.out.println(fr.read());
	   fr.close();
		//It throws IO exception
	}
	
} 
