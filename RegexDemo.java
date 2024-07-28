import java.util.Arrays;

public class RegexDemo{
    public static void main(String[] args) {
        String st1 = "He is a good-boy's isnt he";
        String[] res = st1.split("[a-z]");
        System.out.println(Arrays.toString(res));
    }
}