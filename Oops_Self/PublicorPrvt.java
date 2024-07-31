// package Oops_Self;

import java.util.Arrays;
import java.util.List;

public class PublicorPrvt {
    public static void main(String[] args) {
        System.out.println("I am present inside main method situated inside a public class");
        System.out.println(new Ipv4PatternMatcher().ipv4Pattern);
        List list = Arrays.asList(1,2,3,4);
        list.forEach(i->{i*=2;System.out.print(i)});
    }
    
}
class Ipv4PatternMatcher{
    String ipv4Pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

}
