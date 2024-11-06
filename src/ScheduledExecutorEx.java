
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorEx {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService =  Executors.newScheduledThreadPool(1);

        Runnable task1 = () -> {


                System.out.println("Executing task at"+System.nanoTime());


        };
        Runnable task2 = () -> {


                System.out.println("Executing task at"+System.nanoTime());


        };
        Runnable task3 = () -> {


                System.out.println("Executing task at"+System.nanoTime());




        };
        scheduledExecutorService.schedule(task1,5,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(task1,15,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(task3,25,TimeUnit.SECONDS);
    }
}
