public class CountObject {
    static int nrofObjects=0;
    CountObject(){
        nrofObjects++;
    }
    public static void main(String[] args) {
        System.out.println();
        CountObject obj1 = new CountObject();
        CountObject obj2 = new CountObject();
        CountObject obj3 = new CountObject();
        CountObject obj4 = new CountObject();
        System.out.println(nrofObjects);
        String test = "Hello WOrld";
        test = test.replace(" ","");
        System.out.println(test);
    }
}
