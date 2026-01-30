/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.sql.*;
import java.util.Scanner;
public class jdbc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try
       {
           int ch;
         DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
         Statement stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
         Scanner sc=new Scanner(System.in);
         String sql="select count(*) from employees";
         ResultSet rs=stmt.executeQuery(sql);
         rs.next();
         int cnt=rs.getInt(1);
         sql="select * from employees";
         rs=stmt.executeQuery(sql);
         while(true)
         {
            System.out.println("1. Next ");
            System.out.println("2. previous ");
            System.out.println("3. First ");
            System.out.println("4. Last ");
            System.out.println("5. Go-To ");
            System.out.println("6. Exit ");
            System.out.print("Enter a choice :");
            ch=sc.nextInt();
              if(ch==1)
              {
                    if(rs.isLast())
                    {
                      System.out.println("Already on last record ");
                    }
                    else
                        rs.next();
              }
              else if (ch==2)
              {
                     if (rs.isBeforeFirst())
                     {
                       System.out.println("Can not Move");
                     }
                     else
                     {
                      if(rs.isFirst())
                          rs.last();
                      else
                          rs.previous();
                     }
              }
              else if (ch==3)
                rs.first();
              else if (ch==4)
                rs.last();
              else if (ch==5)
              {
                  System.out.print("Enter record no ");
                  ch=sc.nextInt();
                  if(ch<1||ch>cnt)
                      System.out.println("Invalid Record No. Enter a value between 1 and  "+cnt);
                  else 
                      rs.absolute(ch);
              }
              else if (ch==6)
                  break;
              sc.nextLine();
              System.out.println(rs.getRow()+","+rs.getInt(1)+","+rs.getString(2));
              sc.nextLine();
         }
         
         
       }
       catch(SQLException e)
       {
         System.out.println("Error :"+e);
       }
    }
    
}
