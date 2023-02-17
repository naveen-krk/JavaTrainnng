package exercisee;

import java.util.Scanner;

public class exp4 {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int a=sc.nextInt();
		prime p=new prime();
		prime.check(a);
	}
	
	
}

 static public class prime{
	public static void check(int a) {
	int flag=0;
		for(int i=2;i<a;i++) {
			flag=primes(i,a);
			while(flag==0) {
				System.out.print("its not a prime");
				return;
			}
					}
		result();

	}
	static int primes(int ch,int a) {
	int x=a%ch;
		return x;
	}
	static void result() {
		System.out.println("its a prime");
	}
}
}
