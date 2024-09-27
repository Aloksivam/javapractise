// package Sorting;

import java.util.Arrays;

public class CountingSort {
    static int max(int[]arr){
        int mxm = arr[0];
        for(int i:arr){
            if(mxm<i){
                mxm = i;
            }
        }
        return mxm;
    }
    public static void CountingSortDemo(int[] arr){
        int[] aux = new int[max(arr)+1];
        for(int i:arr){
            aux[i]++;
        }
        System.out.println(Arrays.toString(aux));
        int j=0,i=0;
        while(i<arr.length){
            while(aux[j]!=0){
                arr[i]=j;
                aux[j]--;
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        System.out.println("we will learn about counting sort");
        //idea is it will be used when there are positive elements for sort and they are not larger numbers like marks of student;
        //time complexity in based scenario can be O(n)
        //first we will create an array whose size will be equal to maximum no p/t in array.
        int[] arr = {1,4,1,3,2,4,3,7};
        CountingSortDemo(arr);
    }
}
