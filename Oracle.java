/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */        import java.util.Scanner;
         import java.sql.*;

public class Oracle {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        try
        {
          DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
          Connection mycon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","manager");
          Statement stmt= mycon.createStatement();
          int rollno;
          String nm,sql;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter Rollno : ");
          rollno=sc.nextInt();
          sc.nextLine();
          System.out.print("Enter name : ");
          nm=sc.nextLine();
          sql="insert into students values("+rollno+",'"+nm+"')";
          System.out.println(sql);
          stmt.executeUpdate(sql);
          System.out.println("run system");
          
        }
        catch(SQLException e)
        {
           System.out.println("Error "+e);
        }
    }
    
}
