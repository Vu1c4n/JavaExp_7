import java.util.Random;

public class Prime extends Thread{
    private String name;
    private static final int UPPER_BOUND = 100;
    Prime(String n){
        this.name = n;
    }
    public void run(){
        System.out.println("Thread_" + this.name + " started!");
        Random rand = new Random();
        try{
            this.getPrime();
            int sleepTime = rand.nextInt(5000);
            Thread.sleep(sleepTime);
            System.out.println("Thread_" + this.name + " terminated!");
        }
        catch(InterruptedException e){
            System.out.println("Thread_" + this.name + " Interrupted!");
        }        
    }
    private void getPrime(){
        System.out.print("Prime less than " + UPPER_BOUND + "(THREAD:"+ this.name + "):");
        for(int i = 0; i< UPPER_BOUND; i+=1){
            boolean flag = true;
            for (int j = 2;j<i;j+=1){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag==true) {System.out.println(i);}
        }
        System.out.println("");
    }
}