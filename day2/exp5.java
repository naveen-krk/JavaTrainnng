package exercise2;

public class exp5{   
	
	private static int count;  
	
	public exp5()   
	{  
	
	count++;  
	}  
	public static void main(String args[])   
	{  
	//creating objects  
	exp5 ob1 = new exp5();  
	exp5 ob2 = new exp5();  
	exp5 ob3 = new exp5();  
	exp5 ob4 = new exp5();  
	exp5 ob5 = new exp5();  
	//prints number of objects  
	System.out.print("Total Number of Objects: " + exp5.count);  
	}  
	}  