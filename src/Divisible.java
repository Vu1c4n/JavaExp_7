import java.util.Random;

public class Divisible extends Thread{
    private String name;
    private static final int UPPER_BOUND = 100;
    private static final int NUM = 3;
    Divisible(String n){
        this.name = n;
    }
    public void run(){
        System.out.println("Thread_" + this.name + " started!");
        Random rand = new Random();
        try{
            this.getDivisible();
            int sleepTime = rand.nextInt(5000);
            Thread.sleep(sleepTime);
            System.out.println("Thread_" + this.name + " terminated!");
        }
        catch(InterruptedException e){
            System.out.println("Thread_" + this.name + " Interrupted!");
        }        
    }
    private void getDivisible(){
        System.out.print("Divisible by " + NUM + " in " + UPPER_BOUND + "(THREAD:"+ this.name + "):");
        for(int i = 0; i< UPPER_BOUND; i+=1){
            if(i%NUM == 0) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }
}