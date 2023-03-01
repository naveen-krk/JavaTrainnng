package DesignPattern;
import java.util.ArrayList;
import java.util.List;

public class CommandPattern {
	public static void main(String[] args) {
	
	 Stock itcStock = new Stock();
//command object
     BuyStock buyStockOrder = new BuyStock(itcStock);
     SellStock sellStockOrder = new SellStock(itcStock);

     Broker broker = new Broker();
     broker.takeOrder(buyStockOrder);
     broker.takeOrder(sellStockOrder);

     broker.placeOrders();
}
	
	}
interface Order {
	   void execute();
	}
 class Stock {
	//request
	   private String name = "ITC";
	   private int quantity = 76;

	   public void buy(){
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	   }
	   public void sell(){
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
	   }
	}
  class BuyStock implements Order {
	   private Stock itcStock;

	   public BuyStock(Stock itcStock){
	      this.itcStock = itcStock;
	   }

	   public void execute() {
	      itcStock.buy();
	   }
	}
  //implementation
class SellStock implements Order {
	   private Stock itcStock;

	   public SellStock(Stock itcStock){
	      this.itcStock = itcStock;
	   }

	   public void execute() {
	      itcStock.sell();
	   }
	}
 class Broker {
	 //invoker
	   private List<Order> orderList = new ArrayList<Order>(); 
	   public void takeOrder(Order order){
	      orderList.add(order);		
	   }

	   public void placeOrders(){
	   
	      for (Order order : orderList) {
	         order.execute();
	      }
	      orderList.clear();
	   }
	}

//request command	