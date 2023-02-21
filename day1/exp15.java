package exercisee;

import java.util.Scanner;

public class exp15 {
//to print the list of prime numbers
	public static void main(String[] args) {
		Primelist.print(100);
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Arm.check(x);
		perfect.check(x);
		palin.check(x);
		
	}
}
class Primelist{
	static void print(int b) {
		System.out.println("Prime numbers between 1 to 100");
		for(int i=2;i<b;i++) {
		if(check(i)==1)
			System.out.println(i);
		
		
		}
	}
	static int check(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0)
				return 0;
		}
		return 1;
	}
}
class Arm{

	public static void check(int x) {
		int sum=0;
		int c=x;
		int length=length(x);
		while(x!=0) {
			int n=x%10;
			sum+=(n*n*n);
			x=x/10;
		}
		if(sum==c) {
			System.out.println("Its an armstrong number");
		}
		else {
			System.out.println("Not an armstrong number");
		}
		
	}

	private static int length(int x) {
		int count=0;
		
		while(x!=0)
		{
			count++;
			x=x/10;
		}
		return count;
		
	}
}
	class perfect{
		 static void check(int x) {
			int count=0;
			for(int i=1;i<x;i++)
				if(x%i==0)
					count+=i;
	
		if(x==count)
			System.out.println("perfect number");
			
	}
	}
	class palin{
		 static void check(int x) {
			int r,sum=0,temp;    
			  int n=x; 
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;   
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}
			
	
	}

	
	
