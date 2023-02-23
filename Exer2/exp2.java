package Exer2;

public class exp2 {
public static void main(String[] args) {
	exp2 s =new exp2();
	s.mth1();
}
public void mth1() {
	mth2();
	System.out.println("CALLER");
}
public void mth2() {
	// TODO Auto-generated method stub
	try {
		//int i=1/0;
		return ;
	}
	catch(Exception e) {
		System.out.println("catch-mth2");
	}
	finally {
		System.out.println("finally-mth2");
	}
}


}
