public class StringComplete {
    public static void main(String[] args) {
        System.out.println("we will understand about strings in java detail");
        String nm1 = "Alok";
        char[] nm = {'a','l'};
        String nm2 = "Sinha";
        System.out.println(nm1.concat(nm2));
        System.out.println(nm1);//will not change the previous one
        //Let us try indexing of string
        //  System.out.println(nm1[0]); so it means it does not support indexing of strings  
         System.out.println(nm1.charAt(0)); //so it means it does not support indexing of strings  
         System.out.println(nm.getClass());
         System.out.println(nm1.getClass());
        //  System.out.println(nm1.getSimpleName());

    }
    
}
