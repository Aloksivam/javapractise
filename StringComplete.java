public class StringComplete {
    public static boolean isAnagram(String a,String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean result = true;
        if(a.length()!=b.length()){
            result=false;
        }
        else
       { for (int i = 0; i < a.length(); i++) {
            if(!b.contains(a.charAt(i)+"")){
              result = false;
            }
            
        }}
        return result;
    }
    public static void main(String[] args) {
        StringComplete scm = new StringComplete();
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
         System.out.println(scm.getClass());
        //  System.out.println(nm1.getSimpleName());

        //to check if a particular character is letter or not
        // System.out.println(Character.isLetter('a'));
        System.out.println(Character.isAlphabetic('a'));
        // System.out.println(Character.isLetter('@'));

        //Floor and normal division
        System.out.println(5/2);
        System.out.println("ALok".toLowerCase());
        nm2 = nm2.toLowerCase();

        //checking availablity of a character in a string
        // System.out.println("ALok".contains("A"));
        String test = "name";
       test= test.replace('n'+"", "");
        System.out.println(test);

    }
    
}
