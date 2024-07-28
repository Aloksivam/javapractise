// public package Threads;

public class MultiThreadExecution {
    public static void main(String[] args) {
        DemoThread t1 = new DemoThread("first");
        DemoThread t2 = new DemoThread("second");
        DemoThread t3 = new DemoThread("third");
        DemoThread t4 = new DemoThread("fourth");
        System.out.println("thread 1 is alive"+t1.thread.isAlive());
        System.out.println("thread 2 is alive"+t2.thread.isAlive());
        System.out.println("thread 3 is alive"+t3.thread.isAlive());
        System.out.println("thread 4 is alive"+t4.thread.isAlive());
try {
    System.out.println("wating for child threads to finish");
    t1.thread.join();
    t2.thread.join();
    t3.thread.join();
    t4.thread.join();
} catch (InterruptedException e) {
    System.out.println("main thread interrupted");
}
    }

    
}