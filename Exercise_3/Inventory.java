package Exercise_3;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Inventory {
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(3);
Producer P=new Producer ();
es.execute(()->{
for(int i=0;i<10;i++) {
P.produceItems();
}
});
es.execute(()->{
for(int i=0;i<10;i++) {
P.consumeItems();
}
});
es.shutdown();
}
}
class Producer {
int count=0;
synchronized public void produceItems() {
if(count==1) {
try{wait();}catch(Exception e) {}
}
System.out.println("Producer Produce");
count=1;
notify();
}

synchronized public void consumeItems() {
if(count==0) {
try{wait();}catch(Exception e) {}
}
System.out.println("Consumer Consumes");
count=0;
notify();
}}

