package Rnd;
public class BridgePattern {
public static void main(String[] args) {
	Automobile bus=new Bus(new Produce(),new Assemble());
	bus.manufacture();
}
}
interface WorkShop{
	abstract public void work();
}
class Assemble implements WorkShop{

	@Override
	public void work() {
		System.out.println("Assemble");
		
	}
	
}
class Produce implements WorkShop{

	@Override
	public void work() {
		System.out.println("Produce");
	}
	
}
abstract class Automobile{
	protected WorkShop workShop1;
	protected WorkShop workShop2;
	protected Automobile(WorkShop workShop1,WorkShop workShop2) {
		this.workShop1=workShop1;
		this.workShop2=workShop2;
	}
	abstract public void manufacture();
}
class Bus extends Automobile{
public Bus(WorkShop ws1,WorkShop ws2) {
	super(ws1,ws2);
}
	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("CAR is ");
		workShop1.work();
		workShop2.work();
	}
	
}
//decouple the functional abstraction from the implementation so that the two can vary independently".
//Bridge Pattern is also known as Handle
//It enables the separation of implementation from the interface.
//It improves the extensibility.
//It allows the hiding of implementation details from the client.
//When you don't want a permanent binding between the functional abstraction and its implementation.
//When both the functional abstraction and its implementation need to extended using sub-classes.
//It is mostly used in those places where changes are made in the implementation does not affect the clients.
//Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—
//abstraction and implementation—which can be developed independently of each other.
//This problem occurs because we’re trying to extend the shape classes in two independent dimensions: by form and by color. That’s a very common issue with class inheritance.

//The Bridge pattern attempts to solve this problem by switching from inheritance to the object
//composition. What this means is that you extract one of the dimensions into a separate class hierarchy, 
//so that the original classes will reference an object of the new hierarchy, instead of 
//having all of its state and behaviors within one class.

