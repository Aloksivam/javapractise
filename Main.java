import java.util.HashSet;
import java.util.Set;

public class Main extends Thread {
    public static void main(String[] args) {
      Main thread = new Main();
    //   thread.start();
    //   System.out.println("This code is outside of the thread");
    // int a=2,b=3,c=4,d=5;
    // float k = 4.3f;
    // System.out.println(a++);
    Set l1 = new HashSet<>();
    l1.add(null);
    l1.add("");
    l1.add("java");
    l1.add(null);
    l1.add("java");
    System.out.println(l1.size());
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }