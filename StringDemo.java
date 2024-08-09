public class StringDemo {
    static String ReplaceSpace(String test){
        String rest="";
        String[] res=test.split(" ");
        for(String s:res){
            rest=rest+s;
        }
        return rest;
    }
    public static void main(String[] args) {
        //test
        String test1="alok";
        test1=test1.concat("sinha");//
        System.out.println(test1);
        // StringBuilder sbldr = new StringBuilder("alok");
        // sbldr.append("sinha");
        // System.out.println(sbldr);
        // String name="i am studying in gita college";
        // System.out.println(name.replace(" ",""));
        //
        System.out.println(ReplaceSpace("Alok is there"));
    }
    
}
