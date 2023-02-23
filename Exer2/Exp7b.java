package Exer2;
import java.util.Scanner;
public class Exp7b{
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int denominator,i=0;
	        while(i==0) {
	            System.out.println("Enter the numerator:");
	           String numerator = input.next();
	           if(numerator.startsWith("q")||numerator.startsWith("Q"))
	        	  return ;
	           else{
	        	   System.out.println("Enter the denominator:");
	            denominator =input.nextInt();
	            testDivisionOperations(numerator, denominator);  
	           }
	        }
	    }

		public static void testDivisionOperations(String numerator, int denominator) {
	        try {
	            if(denominator == 0)
	                throw new ArithmeticException();
	            else
	                System.out.println("Quotient  - "+((float) Integer.parseInt(numerator)/denominator));
	        } catch(ArithmeticException exception) {}
}
}