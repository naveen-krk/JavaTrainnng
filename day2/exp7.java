package exercise2;

public class exp7 {
	public static void main(String[] args) {
	final finalobj fb=new finalobj("naveen",99);
	fb.str="nk";
	}

}
class finalobj{
	String str;
	finalobj(String name,int a){
		System.out.print(name);
		System.out.println(str);	
	}
}
