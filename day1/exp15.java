package exercisee;

import java.util.Scanner;

public class exp15 {
//to print the list of prime numbers
	public static void main(String[] args) {
		Primelist.print(100);
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		exp15.display(x);
}
	static void display(int x) {
		int flag=0;
		if(CheckList.Armcheck(x)==1) {
			System.out.println("Its an Armstrong Number");
			flag=1;
		}
		if(CheckList.Perfectcheck(x)==1) {
			System.out.println("Its an Perfect Number");
			flag=1;
		}
		if(CheckList.Palincheck(x)==1) {
			System.out.println("Its an Palindrome Number");
			flag=1;
		}
		if(flag==0){
			System.out.println("None of the above");	
	}
	}
	}
	
class CheckList{
	public static int Armcheck(int x) {
		int sum=0;
		int c=x;
		int length=length(x);
		while(x!=0) {
			int n=x % 10;
			sum+=(n * n * n);
			x=x/10;
		}
		if(sum==c) {
			return 1;
		}
		else {
			return 0;
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
	
		static int Perfectcheck(int x) {
			int count=0;
			for(int i=1;i<x;i++)
				if(x%i==0)
					count+=i;
		if(x==count)
			return 1;
		else 
			return 0;		
	}
	static int Palincheck(int x) {
			int r,sum=0,temp;    
			  int n=x;   
			  temp=n;    
			  while(n > 0){    
			   r=n % 10;   
			   sum=(sum * 10) + r;    
			   n=n / 10;    
			  }    
			  if(temp==sum)    
				  return 1;
			  else 
				  return 0;
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
			if(a % i==0)
				return 0;
		}
		return 1;
	}
}





	

	
	
			
	
	

	
	
