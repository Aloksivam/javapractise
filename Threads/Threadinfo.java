// package Threads;

public class Threadinfo extends Thread {
    public static void main(String[] args) {
        System.out.println("we will understand about few thread informations");
        Thread t = Thread.currentThread();
        System.out.println("Current thread");
        t.setName("Demo thread");
        System.out.println("New name of thread"+t);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");

        }
    }
    
}
