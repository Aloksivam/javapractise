
public class Exam {
    public static void main(String[] args) {
        System.out.println(findPin(3521, 2452, 1352, 38));
    }
    public static int findPin(int input1,int input2,int input3,int input4){

        return (largest(input1)*smallest(input2)*largest(input3)-input4)
        // int pin=0;
        // pin = (sumEvenDigits(input1)+sumEvenDigits(input2)+sumEvenDigits(input3))-(sumOddDigits(input1)+sumOddDigits(input2)+sumOddDigits(input3));
        // if((input4 & 1)==0){
        //     return pin;
        // }
        // else{
        //     return pin*-1;
        // }

    }
        // public static int sumOddDigits(int number) {   
        //     int oddSum = 0; 
        //     while (number > 0) {
        //         int digit = number % 10;
        //         if (digit % 2 != 0) { // Check if the digit is odd
        //             oddSum += digit;
        //         }
        //         number /= 10;
        //     }
        //     return oddSum;
        // }
        // public static int sumEvenDigits(int number) {   
        //     int evensum = 0;
        //     while (number > 0) {
        //         int digit = number % 10;
        //         if (digit % 2 == 0) {
        //             evensum += digit;
        //         }
        //         number /= 10;
        //     }
        //     return evensum;
        // }
        public static int smallest(int number) {   
            int smallest = number%10;
            number/=10; 
            while (number > 0) {
                int digit = number % 10;
                if (digit<smallest) { // Check if the digit is odd
                    smallest= digit;
                }
                number /= 10;
            }
            return smallest;
        }
        public static int largest(int number) {   
            int largest = number%10;
            number/=10; 
            while (number > 0) {
                int digit = number % 10;
                if (digit<largest) { // Check if the digit is odd
                    largest= digit;
                }
                number /= 10;
            }
            return largest;
        }
        public static int firstRepeated(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                int prevind=0;
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j]==arr[prevind]){
                        return prevind;
                    }
                }
            }
            return -1;
        }
       
    }
    

