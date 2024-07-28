public class ThreadDemo extends Thread {
    
    private String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
    }

    // The run method is overridden to define the thread's behavior
    public void run() {
        System.out.println(threadName + " is running");

        // Loop to print "thread 1 is running" 100 times
        for (int i = 0; i < 100; i++) {
            System.out.println(threadName + " - Iteration: " + (i + 1));
        }
    }
    
    // The main method, where execution begins
    public static void main(String[] args) {
        System.out.println("We will learn about threads");

        // Creating instances of ThreadDemo with different names
        ThreadDemo td1 = new ThreadDemo("Thread 1");
        ThreadDemo td2 = new ThreadDemo("Thread 2");

        // Starting the threads
        td1.start();
        td2.start();
    }
}
