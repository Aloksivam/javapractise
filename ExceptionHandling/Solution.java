import java.util.Scanner;
import java.lang.*;
class MyCalculator {
    long power(int n,int p) throws Exception{
        if(n<0 || p<0){
            throw  new Exception("n or p should not be negative.");
        }
        else if(n==0&&p==0){
            throw new Exception("n and p should not be zero.");
        }
        else{
            return (long)Math.pow(n,p);
        }
    }
    /*
    * Create the method long power(int, int) here.
    */
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception{
        // while (in .hasNextInt()) {
        //     int n = in .nextInt();
        //     int p = in .nextInt();
            
            try {
                int arr[] = {1,2};
                System.out.println(arr[2]);
                System.out.println(5/0);
            } 
            catch (IndexOutOfBoundsException e) {
                System.out.println("oh, our element was not found");
            }
            catch(ArithmeticException e){
                System.out.println("zero was there in denominator");
            }
            finally{
                System.out.println("i will execute always");
            }
        // }
    }
}