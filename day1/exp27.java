package exercisee;

public class exp27 {
public static void main(String[] args) {
	int investment=40000;
	investment inv=new investment();
	investment=inv.investmentp(investment,40);
	System.out.println(investment);
	investment=inv.investmentm(investment,1500);
	System.out.println(investment);
	investment=inv.investmentp(investment,12);
	System.out.println("Final amount remaining is "+investment);
	
}
}
class investment{
	int investmentp(int a,int change) {
		return a+(change*a)/100;
	}
	int investmentm(int a,int change) {
		return a-change;
	}
}
