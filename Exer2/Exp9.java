package Exer2;
import java.util.*;
public class Exp9 {
public static void main(String args[]) throws Exception{
	Scanner input = new Scanner(System.in);
	int count=1;
	int totalMarks=0;
	while(count<=10) {
	try {
		System.out.println("Enter Student"+count+"marks : ");
	String marks=input.nextLine();
	int student = Integer.parseInt(marks);
	try {
		if(student<0 || student>100) {
			throw new OutOfRangeException();
		}
	}
	catch(OutOfRangeException e) {
		count--;
		System.out.println(e);
	}
	totalMarks+=student;
count++;
	}
	catch(NumberFormatException e) {
		System.out.println(e);
	}
	
	}
	int avg=totalMarks/10;
	System.out.println("Average : "+avg);
}

}
class OutOfRangeException extends Exception{
	OutOfRangeException(){
		System.out.println("enter the number with in the range");
	}
}
