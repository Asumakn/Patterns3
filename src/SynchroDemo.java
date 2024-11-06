import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchroDemo {
    private  static int counter = 0;

    public static void increment(){

        System.out.println(Thread.currentThread().getName());
        counter= counter+1;
    }

    public int getCounter(){

        return counter;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0 ; i<100;i++){
            executorService.submit(() -> SynchroDemo.increment());
        }
    }
}
