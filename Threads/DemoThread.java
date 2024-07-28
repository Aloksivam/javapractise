// package Threads;

public class DemoThread implements Runnable{
    String name;
    Thread thread;
    DemoThread(String threadname){
        name= threadname;
        thread = new Thread(this,name);
        System.out.println("New thread"+thread);
        thread.start();
    }

    @Override
    public void run() {
       try {
        for (int i = 5; i > 0; i--) {
            System.out.println("child thread"+i);
            Thread.sleep(100);
            
        }
       } catch (InterruptedException e) {
        System.out.println(name+"Intterrupted");
        // TODO: handle exception
       }
       System.out.println(name+"exiting");
    }
    
}
