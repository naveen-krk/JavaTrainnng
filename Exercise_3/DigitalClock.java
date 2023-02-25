package Exercise_3;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.time.LocalDateTime;
public class DigitalClock {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        int hour = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();
        int second = LocalDateTime.now().getSecond();
        DisplayTime c = new DisplayTime(hour, minute, second);
        es.execute(() - > {
            while (true)
                c.sec();
        });
        es.execute(() - > {
            while (true)
                c.min();
        });
        es.execute(() - > {
            while (true)
                c.hrs();
        });
        es.shutdown();
    }
}
class DisplayTime {
    int sec;
    int min;
    int hrs;
    DisplayTime(int hours, int minute, int second) {
        this.sec = second;
        this.min = minute;
        this.hrs = hours;
    }
    synchronized public void sec() {
        int i;
        if (sec < 60) {
            for (i = sec; i < 60; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(hrs + ":" + min + ":" + i);
            }
            sec = i;
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    synchronized public void min() {
        if (min < 59 && sec == 60) {
            sec = 0;
            min++;
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    synchronized public void hrs() {
        if (min == 59) {
            min = 0;
            sec = 0;
            if (hrs == 23)
                hrs = 0;
            else
                hrs++;
            notifyAll();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
