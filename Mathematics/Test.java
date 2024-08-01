// package Mathematics;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        double x = 0.4;
        double y = 0.3;
        System.out.println(x-y);
        BigDecimal bd = new BigDecimal("0.4");
        BigDecimal bd2 = new BigDecimal("0.3");
        System.out.println(bd.subtract(bd2));
        try {
            System.out.println(10/0);
            
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        System.out.println(Integer.parseInt("0.3"));
    }
    
}
