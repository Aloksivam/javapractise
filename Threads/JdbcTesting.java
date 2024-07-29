import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTesting {
    public static void main(String[] args) {
        PreparedStatement pst = con.PrepareStatement("select * from emp");
        ResultSet rs = pst.executeQuery();
        rs.next();
        rs.next();
        System.out.println(rs.getString(1));
    }
    
}
