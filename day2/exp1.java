package exercise2;

public class exp1 {
	static int a=10;
	static char c='s';
	public static void main(String[] args) {
		System.out.println("int :"+a +"  char:"+c);
		Check ch=new Check();
		ch.primitive(a,c);
		System.out.println("int :"+a +"  char:"+c);
		System.out.println(ch.str);
		ch.object(ch);
		//array
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[0]);
		ch.array(arr);
		System.out.println(arr[0]);
	}
}
class Check{
	String str="naveen";
	static void primitive(int a,char s){
		a=12;
		s='x';
		System.out.println("int :"+a +"  char:"+s);		
	}
 public void array(int[] arr) {
		arr[0]=5;
	}
	static void object(Check ch){
		ch.str="karthik";
		System.out.println(ch.str);		
	}
}
