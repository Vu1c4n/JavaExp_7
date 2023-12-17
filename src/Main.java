public class Main{
    public static void main(String[] args){
        testMyThread();
        testPrime();
        testDivisible();
    }
    public static void testMyThread(){
        MyThread mt1 = new MyThread("x1");
        MyThread mt2 = new MyThread("x2");
        MyThread mt3 = new MyThread("x3");
        MyThread[] mts = {mt1,mt2,mt3};
        for(MyThread mt: mts){
            mt.start();
        }
    }
    public static void testPrime(){
        Prime p = new Prime("primeThread");
        p.start();
    }
    public static void testDivisible(){
        Divisible d = new Divisible("divisibleThread");
        d.start();
    }
}