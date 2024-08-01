import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic{
    int add(int n1,int n2){
        return n1+n2;
    }
}
class Adder extends Arithmetic{
   
}
public class SSolution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass());	//class Adder
        System.out.println("My superclass is: " + a.getClass().getName());	//Adder
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	//Arithmetic
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
