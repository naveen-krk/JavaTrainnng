package Exercise_3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CountNumber {
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(1);
	System.out.println("Counting Numbers");
	es.execute(()->{
		for(int i=1;i<=100;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			}catch(Exception e) { }  
			if(i%10==0)
				System.out.println("Multiple of 10");
		}
	});
}
}
