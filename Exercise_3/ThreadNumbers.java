package Exercise_3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ThreadNumbers {
	
public static void main(String[] args) throws Exception { //InterruptedException
	
	PrintNumbers num=new PrintNumbers();
	ExecutorService es=Executors.newFixedThreadPool(2);
	es.execute(()-> {
		Thread.currentThread().setName("odd thread");
		System.out.println(Thread.currentThread());
		num.odd();
	});
	es.execute(()-> {
		Thread.currentThread().setName("even thread");
		System.out.println(Thread.currentThread());
		num.even();
	});
	es.shutdown();
}
}
class PrintNumbers{
	 public void odd() {
		for(int i=1;i<=100;i=i+2) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
			}
		}
	}
public void even() {
	for(int i=2;i<=100;i=i+2) {
		System.out.println(i);
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
		}
	}
}
}

