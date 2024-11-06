import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0;i<10;i++){
            Runnable worker = new workerThread(""+1);
            executor.execute(worker);

        }
        System.out.println("End");
    }

}
class workerThread implements Runnable{
private String  message;

    public workerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(Start message = )"+message);
    processmessage();
        System.out.println(Thread.currentThread().getName()+"(End )"+message);
    }
    private void processmessage(){


        try{Thread.sleep(2000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}