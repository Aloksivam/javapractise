import java.util.ArrayList;
import java.util.Arrays;

class Parent{
    int nr = 45;
}
class Parent2{
    int nr = 56;
}

interface ParentInterface{
   private void intro(){
    System.out.println("hi, i am present inside an interface but i am a private methoehd");
   }
   static void exit(){
    System.out.println("hi, i am going out");
   }
   public void greet();
}

public class Classes extends Parent implements ParentInterface{
   @Override
    public void greet(){
        System.out.println("hello sir");
    }
    
    public static void main(String[] args) {
        System.out.println();
        // Parent p = new Parent();
        Classes cl = new Classes();
        // ParentInterface.intro
        System.out.println(cl.nr);
        int[] arr = {1,2,3,4,7,9,0};
        // arr[8]=7;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(arr[3]);
        // Arrays ar = new Arrays();
        System.out.println(arr.getClass());


        //ArrayList
        ArrayList<Integer> li = new ArrayList<>();
        System.out.println(li.size());
        li.add(12);
        li.remove(0);
        li.add(0,44);
        // li.add(-1,34);
        System.out.println(li.get(0));
    }
}
