package Exer2;
import java.util.*;
public class Exp8 {
public static void main(String args[]) throws Exception{
	Scanner input = new Scanner(System.in);
	int count=1;
	int totalMarks=0;
	while(count<=10) {
	try {
		System.out.println("Enter Student"+count+"marks : ");
	String marks=input.nextLine();
	int student = Integer.parseInt(marks);
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
