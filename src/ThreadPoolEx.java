
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx {

    public static void main(String[] args) {
        System.out.println(("Inside : "+Thread.currentThread().getName()));
        System.out.println("creating an executor service with a thread pool size 2");
        ExecutorService executorService = Executors.newFixedThreadPool(3);


        Runnable task1 = () -> {
            try {

                System.out.println("Executing task 1");
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {

            }
        };
        Runnable task2 = () -> {
            try {

                System.out.println("Executing task2");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {

            }
        };
        Runnable task3 = () -> {
            try {

                System.out.println("Executing task 3");
                TimeUnit.SECONDS.sleep(6);
            } catch (InterruptedException e) {

            }
        };
        System.out.println("Submitting the task for executing");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.shutdown();
    }
}
