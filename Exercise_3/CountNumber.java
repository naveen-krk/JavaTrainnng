package Exercise_3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CountNumber {
public static void main(String[] args) {
	CountNumber number =new CountNumber();
	ExecutorService es=Executors.newFixedThreadPool(2);
	System.out.println("Counting Numbers");
	es.execute(()->{
		try {
			number.num();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
	es.execute(()->{
		try {
			number.mul();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
}
synchronized void num() throws InterruptedException {
	for(int i=1;i<=100;i++) {
		if(i%10!=0)	
			System.out.println(i);
		else {
			notify();
			wait();
		}
		}
	}
synchronized void mul() throws InterruptedException {	
System.out.println("Multiple of 10");
notify();
wait();
}
}
