package exercisee;

public class exp17 {
	final static int rollnumber = 29;
	static String myName = "Hari";
	static void main(String[] args) {
		 exp17a accessA = new exp17a();
		 exp17b accessB = new exp17b();
		 @SuppressWarnings("unused")
		exp17c accessC = new exp17c(rollnumber);    //The constructor exp17c() is undefined
		                  
		 accessA.accessNumber();
		 accessB.accessName();
	   }
}

class exp17a extends exp17{
	
	public void accessNumber()
	{
         //rollnumber = 32;       //cannot assign a value to final variable number ,number = 32;
		 
	       System.out.println(rollnumber);
	}
	
}

class exp17b extends exp17{
	
	public void accessName()
	{
	       System.out.println(myName);
	}
	
}


class exp17c extends exp17{
	
	      //The constructor exp17c() is undefined
   
	exp17c(int rollNumber){
		System.out.println(rollnumber);
	}
}
