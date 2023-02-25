package Exercise_3;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Message {
public static void main(String[] args) {
	Display ds =new Display();
	ExecutorService es=Executors.newFixedThreadPool(3);
	es.execute(()-> {
		Thread.currentThread().setName("FirstThread");
		ds.Display(0);
		});
	es.execute(()-> {
		Thread.currentThread().setName("Second Thread");
		ds.Display(1);
		});
	es.execute(()-> {
		Thread.currentThread().setName("Third Thread");
		ds.Display(2);
		});
	es.shutdown();
}
}
class Display{
	synchronized void Display(int num){
		String[] str={"[-----","Message","-----]"};
		System.out.print(str[num]);
	}
}
