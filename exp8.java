package exercisee;

import java.util.Scanner;

public class exp8{
public static void main(String args[]) {
Scanner input=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=input.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
System.out.println("Enter the element "+i);
a[i]=input.nextInt();
}
System.out.println("enter the number for which location should be identified");
int b=input.nextInt(),i;
for( i=0;i<n;i++) {
if(b==a[i]) {

break;
}

}
System.out.println("the number is in the position is "+(i));
}
}
