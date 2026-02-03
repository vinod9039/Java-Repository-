

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.sql.*;
public class jdbc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vi","damoh");
           Statement stm=con.createStatement();
           int pno;
           String sql,name,brand,garanty;
          // sql="insert into product values(7,'cpu','IBM','5 month')";
           // sql="update product set pno=6 where name='cpu'";
           sql="delete from product where pno=7";
           System.out.println(sql);
           stm.executeUpdate(sql);
           System.out.println("insert new record");
        
        }
        catch(SQLException e)
        {
         System.out.println("Error "+e);
        }
    }
    
}
