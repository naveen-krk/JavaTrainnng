package Exercise_3;
public class ThreadStart {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("Naveen Thread");
        t.start();
        t.start();
        //The thread whose work is completed will get destroyed ,therefore 
        //can not be started again.
    }
}
