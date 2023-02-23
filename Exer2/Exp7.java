package Exer2;
import java.util.Scanner;
public class Exp7{
	 public static void main(String[] args) {
	        int numerator , denominator;int i=0;
	        while(i==0) {
	        	 Scanner input = new Scanner(System.in);
	            System.out.println("Enter the numerator:");
	            numerator = input.nextInt();
	            System.out.println("Enter the denominator:");
	            denominator = input.nextInt();
	            testDivisionOperation(numerator, denominator);
	        }
	    }

	    public static void testDivisionOperation(int numerator, int denominator) {
	        try {
	            if(denominator == 0)
	                throw new ArithmeticException();
	            else
	                System.out.println("Quotient : - "+((float)numerator/denominator));
	        } catch(ArithmeticException exception) {
	            System.out.println("Poor input data!");
	            System.out.println(exception);
	        }
}
}