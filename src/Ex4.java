public class Ex4 {
    public static void main(String[] args) {
        Table obj = new Table();

    MyThread1 t1 = new MyThread1(obj);
    t1.start();
    }
}
class Table{


    void printTable(int n){

        for(int i =0;i<=5;i++){

            System.out.println("n"+ i);
        }
        try {
            Thread.sleep(200);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t =t;
    }
    public void run(){
        t.printTable(5);
    }
}




