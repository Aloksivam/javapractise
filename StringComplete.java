import java.util.Arrays;
import java.util.LinkedHashSet;

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
    static String RevString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static int[] CountVowelConst(String st){
        if(st.length()==0){
            return new int[]{0,0};
        }
        int vowels = 0, consonants = 0;
        String vo="aeiou";
        for (char c : st.toCharArray()){
            if(Character.isLetter(c)){
                if(vo.contains(c+"")){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        return new int[]{vowels,consonants};
    }
    //Removes Duplicate from a string
    static String RemoveDuplicate(String st){
        LinkedHashSet <Character>set = new LinkedHashSet<>();
        for (Character c : st.toCharArray()) {
            set.add(c);
        }
        StringBuffer stbf = new StringBuffer("");
        for (Character c : set) {
            stbf.append(c);
        }
        return stbf.toString();
    }
    //check if it only consists of digits
     static boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static String removeCharacter(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }
    public static void main(String[] args) {
        // System.out.println(('9'-'1'));
        // System.out.println('9'*1==9);
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

        //testing lexicographically sorting of Strings
        // System.out.println("ALok" > "sinha");

        //for comparing you can implement another way
        System.out.println("lexiclaly"+"Zlok".compareTo("Anha"));
        // System.out.println('a'>'b');
    //     String input = "hello world";
    //     String capitalized = capitalizeFirstLetter(input);
    //     System.out.println(capitalized); // Output: Hello world
    //     String str = new String("hello javatpoint how r u");  
    //   char[] ch = new char[10];  
    //   try{  
    //      str.getChars(6, 16, ch, 0);  
    //      System.out.println(ch[0]);  
    //   }catch(Exception ex){System.out.println(ex);}  
    System.out.println(Arrays.toString(CountVowelConst("alok s good")));
    System.out.println(RevString("alok is"));
    System.out.println(RemoveDuplicate("aalokisgood"));
    }
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
