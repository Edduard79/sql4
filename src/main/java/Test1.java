import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Test1 {

    public static void main (String... args) throws SQLException {

        Connection con;
        Statement stat = null;
        ResultSet rs = null;

        con = DriverManager.getConnection("jdbc:mysql://localhost/newdb?" + "user='root'&password=Sql123.");

        stat = con.createStatement();

        String que = "ALTER TABLE students ADD country varchar(30); ";

        stat.execute(que);

        que = "UPDATE students SET country = 'Italy' WHERE student_id IN (1, 2);";
        stat.execute(que);

        que = "UPDATE students SET country = 'Germany' WHERE student_id IN (3, 4);";
        stat.execute(que);




    }


}
