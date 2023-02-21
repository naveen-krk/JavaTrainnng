package exercisee;

import java.util.Scanner;

public class exp11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[][] mat=new int[5][2];
	for(int i=0;i<5;i++) {
		for(int j=0;j<2;j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	int flag=1;
	int x=1;
	for(int i=0;i<5;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(mat[i][j]+"  ");
			if(flag==x) {
				System.out.println("");
				x++;
			flag=0;
			}
			flag++;
		}
	}
}
}
