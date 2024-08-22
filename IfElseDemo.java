public class IfElseDemo {

    public static void main(String[] args) {
        
        System.out.println();
    }
    public String[] rransformCodes(int[] input1){
        // int n = input1.length;
        String[] res = new String[input1.length];
        int i=0;
        for(int n: input1){
            String ans="";
            if(n==6)
            ans+="C";
            else
            ans+="W";
            if(n==0){
                ans+="Z";
            }
            if(n==1){
                ans+="Z";
            }
            if(isPrime(n)){
                ans+="P";
            }
            else{
                ans+="N";
            }
            ans+=sumOfDigitsUntilSingleDigit(n);
            if(n%2==0){
                ans+=n/2;
            }
            else{
                ans+=((n-1)/2);
            }
            res[i]=ans;
            i++;
        }
        return res;
    }
    public static int sumOfDigitsUntilSingleDigit(int number) {
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return number;
    }

    private static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;  // Remove the last digit
        }

        return sum;
    }
    public static boolean isPrime(int number) {
        // Prime numbers are greater than 1
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    
}
