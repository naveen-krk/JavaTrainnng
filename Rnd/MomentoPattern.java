package Rnd;
import java.util.ArrayList;
import java.util.List;
public class MomentoPattern {
	public static void main(String[] args) {
		   
	      Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      
	      originator.setState("Number 1");
	      originator.setState("Number2");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("Number3");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("Number4");
	      System.out.println("Current State: " + originator.getState());		
	      
	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	   }
}
 class Memento {
	   private String state;

	   public Memento(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }	
	}
 class Originator {
	   private String state;

	   public void setState(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }

	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }

	   public void getStateFromMemento(Memento memento){
	      state = memento.getState();
	   }
	}
 class CareTaker {
	   private List<Memento> mementoList = new ArrayList<Memento>();

	   public void add(Memento state){
	      mementoList.add(state);
	   }

	   public Memento get(int index){
	      return mementoList.get(index);
	   }
	}

//Memento pattern is used to restore state of an object to a previous state.
//Memento pattern falls under behavioral pattern 
//Memento-contains state to be restored
//Originator creates and stores states in momento
//Caretaker object is responsible to restore object state from Memento.
//It is used in Undo and Redo operations in most software.
//It is also used in database transactions.
 //the object whose state needs to be saved is called an Originator. 
 //The Caretaker is the object triggering the save and restore of the state, which is called the Memento
 //However, if the state of the Originator is heavy, using the Memento Design Pattern can lead to an expensive creation process and increased use of memory.