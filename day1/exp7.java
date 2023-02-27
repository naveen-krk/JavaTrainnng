package exercisee;


import java.util.*;
public class exp7 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the size of array : ");
int n=input.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
System.out.println("enter element "+i);
a[i]=input.nextInt();

}
System.out.println("Array before sorting : ");
for(int i=0;i<n;i++) {
System.out.print(a[i]+" ");
}

Arrays.sort(a);
System.out.println("Array after sorting in ascending order: ");
for(int i=0;i<n;i++) {
System.out.print(a[i]+" ");
}

}
}

