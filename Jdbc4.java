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

public class Jdbc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try
       {
         
         DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
         Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
         Scanner sc=new Scanner(System.in); 
        // String sql="select count(*) from empolyees1";
        int  rollno = 0,ch,count=0;
        String name;
        String sql="select count(*) from students";
        ResultSet rs=stmt.executeQuery(sql);
        rs.next();
        count=rs.getInt(1);
        //System.out.println(""+count);
        if(count==0)
        {
           count++;
            rollno=count;
            
        }
        
          sql="select *from students"; 
           rs=stmt.executeQuery(sql);
         while(rs.next())
         {
             if (rs.isLast())
             {
               //rollno=rs.getInt(1);
                 rollno=count;
               System.out.println("rollno1 :"+rollno);
               rollno++;
               System.out.println("rollno2 :"+rollno);
               
             }
        }
         
          while(true)
          {
              System.out.print("1. Add ");
              System.out.println("2.break ");
              System.out.print("Enter a choice : ");
              ch=sc.nextInt();
              
              sc.nextLine();
            if(ch==1)
            {
             System.out.println("rollno :"+rollno);
             System.out.print("Enter name : ");
             name=sc.nextLine();
             sql="insert into students values("+rollno+",'"+name+"')";
             stmt.executeUpdate(sql);
             System.out.println("Data saved ");
             
             rollno++;
             System.out.println("Afetr data saving "+rollno);
            }
            else if(ch==2)
               break;
             
                     
          }
       
       }
       catch(SQLException e)
       {
         System.out.println("Error : "+e);
       }
        
    }
    
}
