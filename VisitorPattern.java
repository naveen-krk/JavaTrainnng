package DesignPattern;
public class VisitorPattern{
    public static void main(String[] args) {
        InsuranceMessenger insuranceMessenger = new InsuranceMessenger();
        Client client[] = new Client[3];
        //client[0]= new Bank("sbi", "999", "debit");
        client[1]= new College("Tce", "224", "Education"); 
        insuranceMessenger.insuranceMails(client[1]);
    }
}
 interface Visitor {
	 void visitCollege(College college);
    void visitBank(Bank bank);
    void visitHotel(Hotel hotel);
}
 abstract class Client {

     public abstract void accept(Visitor visitor);
}
 class Bank extends Client{
	  
	    public Bank(String name,String id,String service){
	      
	        System.out.println("Name of the Bank : "+name);
	       System.out.println("ID of the Bank :"+id);
	       System.out.println("Service provided :"+service);
	    }
	    
	    public void accept(Visitor visitor){
	            visitor.visitBank(this);
	    }
	}
 class InsuranceMessenger implements Visitor{

	    public void visitBank(Bank bank){
	        System.out.println("Bank  insurance details");
	    }
	    public void visitHotel(Hotel hotel){
	        System.out.println("Hotel infrastructure insurance details");
	    }
	    public void visitCollege(College college){
	        System.out.println("College furniture insurance");
	    }

	    public void insuranceMails(Client client){
	        
	            client.accept(this);
	    }
	}
 class Hotel extends Client{
	  
	    public Hotel(String name,String id,String service){
	       
	       System.out.println("Name of the Hotel : "+name);
	       System.out.println("ID of the Hotel :"+id);
	       System.out.println("Service provided :"+service);
	    }
	    public void accept(Visitor visitor){
	        visitor.visitHotel(this);
	    }
	}
 class Company extends Client {
	    int noOfEmployees;
	    Company(String name,String id, int noOfEmployees){
	      
	        this.noOfEmployees=noOfEmployees;
	    }
	    public void accept(Visitor visitor){
	    }
	}
 class College extends Client{
	  
	    public College(String name,String id,String service){
	       
	       System.out.println("Name of the College : "+name);
	       System.out.println("ID of the College :"+id);
	       System.out.println("Service provided :"+service);
	    }
	    public void accept(Visitor visitor){
	        visitor.visitCollege(this);
	    }
	}
 
