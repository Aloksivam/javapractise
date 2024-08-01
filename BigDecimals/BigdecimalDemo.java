// package BigDecimals;
// 
import java.math.BigDecimal;
import java.util.Arrays;
public class BigdecimalDemo {
    int max;
    public void sorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            max = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] =temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        // double a=0.03;
        // double b=0.04;
        // double c=b-a;
        // System.out.println(c);
        String a =  "0.03";
        String b = "0.03";
        String d = "-0.03";
        System.out.println(a.compareTo(b));
        BigDecimal bd1 = new BigDecimal(a);
        BigDecimal bd2 = new BigDecimal(d);
        System.out.println(bd2);
        // BigDecimal bd1 = BigDecimal.valueOf(a);
        // BigDecimal bd2 = BigDecimal.valueOf(b);
        System.out.println(bd2.subtract(bd1));
        // System.out.println(bd1.compareTo(bd2));
        System.out.println(bd2.compareTo(bd1));
        new BigdecimalDemo().sorting(new int[]{1,2,3,4});


    }
}
