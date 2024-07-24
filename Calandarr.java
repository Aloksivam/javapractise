import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Calandarr{
    public static void main(String[] args) throws ParseException {
        String date = "2024-07-23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        Date dobj = sdf.parse(date);
        Calendar cldr = new GregorianCalendar();
        cldr.setTime(dobj);
        SimpleDateFormat f = new SimpleDateFormat("EEEE");
// String str = f.format(new Date());   
        System.out.println(f.format(cldr.getTime()));
    }
}