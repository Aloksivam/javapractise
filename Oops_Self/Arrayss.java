import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Arrayss {
    public static void main(String[] args) {
        int n = 34;
        int n2 = 45;
        int[] arr2;
        int[] arr = {34,45};//same type of data is stored inside an array
        System.out.println(arr[1]); 
        //if we want to access an element of 5th position (index goes from 0 to n-1( wherere n is size of array))
        try{
            arr[2] = 55;//O(1) constant time to access the element of an array
        }
        catch(Exception e){
            System.out.println("khushi, please try to access valid element");
        }
        finally{
            System.out.println(" i will always run");
        }
        System.out.println(arr[1]);
        // arr
        ArrayList<Integer> arlst = new ArrayList<>();
        arlst.add(12);
        // arlst.add("khushi");
        System.out.println(arlst);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.isEmpty();
        System.out.println(list);
        // list.getFirst()
        // LinkedList<>
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.get(0));

    }
}
