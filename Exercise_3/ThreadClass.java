package Exercise_3;
public class ThreadClass {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("A");
        Threads t1 = new Threads(str);
        Threads t2 = new Threads(str);
        Threads t3 = new Threads(str);
        t1.start();
        t2.start();
        t3.start();
    }
}
class Threads extends Thread {
    StringBuffer sbr;
    Threads(StringBuffer sbr) {
        this.sbr = sbr;
    }
    @Override
    public void run() {
        synchronized(sbr) {
            for (int i = 1; i <= 100; i++) {
                System.out.print(sbr + " ");
            }
            System.out.println();
            int v = sbr.charAt(0);
            v++;
            sbr.replace(0, 1, (char) v + "");
        }
    }
}
