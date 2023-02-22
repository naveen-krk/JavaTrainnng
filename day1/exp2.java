package exercisee;

public class exp2 {
	public static void main(String[] args) {
		PrintDefaultValues df=new PrintDefaultValues();
		df.PrintDefaultValue();
	}
}
class PrintDefaultValues{
	 int a;
	 float b;
	 String c;
     public void PrintDefaultValue() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}	
}
