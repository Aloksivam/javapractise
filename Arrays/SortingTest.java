import java.util.*;
public class SortingTest {
    static int SecondLargest(int[] arr){
        // arr = {}
        int larg=arr[0];
        int SLarg=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>larg ){
                larg=arr[i];
            }
            if(arr[i]>SLarg && arr[i]!=larg){
                SLarg = arr[i];
            }
        }
        // for (int i = 1; i < arr.length; i++) {
        //     if(arr[i]>SLarg && arr[i]!=larg){
        //         SLarg=arr[i];
        //     }
        // }
        return SLarg;
     }
    public static void main(String[] args) {
        // int[] arr = {5,4,3,2,1};.''
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(SecondLargest(new int[]{4,44,31,1,0}));

    }

}
