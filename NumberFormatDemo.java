import java.text.NumberFormat;
import java.util.Locale;
public class NumberFormatDemo {
    public static void main(String[] args) {
        double d = 12324.13;
        System.out.println(d+0.1);
        @SuppressWarnings("deprecation")
        Locale indiaLocale = new Locale("hn","IN");
        NumberFormat nf0  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat nf  = NumberFormat.getInstance(Locale.ITALY);
        NumberFormat nf2  = NumberFormat.getInstance(Locale.US);
        NumberFormat nf3  = NumberFormat.getInstance(Locale.CHINA);
        NumberFormat nf4  = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println("US representation of " + d + " : " + nf2.format(d));
        System.out.println("INDIA representation of " + d + " : " + nf0.format(d));
        // System.out.println("ITALY representation of " + d + " : " + nf.format(d));
        System.out.println("CHINA representation of " + d + " : " + nf3.format(d));
        System.out.println("FRANCE representation of " + d + " : " + nf4.format(d));
    }
}
