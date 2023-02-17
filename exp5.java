package exercisee;

import java.util.Scanner;

public class exp5 {
	static int n;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int sum=0;
	for(int i=0;i<n;i++) {
		int f=sc.nextInt();
		sum=sum+f;
		
	}
	System.out.print(average(n,sum));
}
static int average(int num,int sum) {

	return sum/num;
	
}
}
