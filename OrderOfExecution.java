import java.util.ArrayDeque;
import java.util.Collection;

public class OrderOfExecution {
    public void myMethod(){
        System.out.println("method");
    }
    {
        System.out.println("Instance block");
    }
    public void OrderOfExecution(){
        System.out.println("Constructor");
    }
    static{
        System.out.println("static block");
    }
    public static void main(String[] args) {
        // OrderOfExecution oec = new OrderOfExecution();
        // oec.OrderOfExecution();
        // oec.myMethod();
        byte x=64;
        int i;
        byte y;
        i=x<<2;
        y = (byte)(x<<2);
        System.out.println(i+"  "+y);
        Collection c = new ArrayDeque<>();
        // c.get()
        // c.remo
        // c.si
    }
}
