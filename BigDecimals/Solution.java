import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        for(int i=0;i<n;i++)
        {
            int max = i;
            for(int j=i+1;j<n;j++){
                BigDecimal bd1 = new BigDecimal(s[j]);
                BigDecimal bd2 = new BigDecimal(s[max]);
                if(bd1.compareTo(bd2)>0){
                    max = j;
                }
            }
            String temp = s[i];
            s[i] = s[max];
            s[max] = temp;
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

        BigInteger num1 = new BigInteger("17"); // Prime number
        BigInteger num2 = new BigInteger("18"); // Non-prime number

        // Check if they are probable primes
        boolean isPrime1 = num1.isProbablePrime(10); // certainty of 10
        boolean isPrime2 = num2.isProbablePrime(10); // certainty of 10

        // Print results
        System.out.println(num1 + " is prime: " + isPrime1);
        System.out.println(num2 + " is prime: " + isPrime2);
    }

}