import java.util.Random;

public class MyThread extends Thread{
    private final String name;
    MyThread(String n){
        this.name = n;
    }
    public void run(){
        System.out.println("Thread_" + this.name + " started!");
        Random rand = new Random();
        try{
            int sleepTime = rand.nextInt(5000);
            Thread.sleep(sleepTime);
            System.out.println("Thread_" + this.name + " terminated!");
        }
        catch(InterruptedException e){
            System.out.println("Thread_" + this.name + " Interrupted!");
        }        
    }
}