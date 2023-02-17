package exercisee;

import java.util.Scanner;

public class exp9 {
private static Scanner sc;

public static void main(String[] args) {
	sc = new Scanner(System.in);
	int x=sc.nextInt();
	int []arr=new int[x];
	for(int i=0;i<x;i++) {
		arr[i]=sc.nextInt();
	}
	int y=x;
	for(int i=0;i<x/2;i++) {
		int temp=arr[i];
	    arr[i]=arr[y-1];
	    arr[y-1]=temp;
	    y--;
	}
	for(int i=0;i<x;i++) {
		System.out.println(arr[i]);
	}
}
}
