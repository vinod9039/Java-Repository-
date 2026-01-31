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
public class jdbc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
         DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vi","damoh");
         Statement stmt=con.createStatement();
         Scanner sc=new Scanner(System.in);
         int productid=0,count=0;
         float price,discount = 0,taxrate = 0,finalprice;
         String pname,category,region,sql;
         
         sql="select count(*) from products";
        // System.out.println(sql);
         ResultSet rs=stmt.executeQuery(sql);
         rs.next();
         count=rs.getInt(1);
        // System.out.println(" count : "+count);
         if(count==0)
             productid++;
         else
         {
            sql=" select max(prduct_id) from products";
             rs= stmt.executeQuery(sql);
             rs.next();
             productid=rs.getInt(1);
            // System.out.println("Product ID : "+productid);
             productid++;
           //  System.out.println("Product ID :"+productid);
             
         }
         
         System.out.println("Product ID :"+productid);
         System.out.print("Enter Product Name : ");
         pname=sc.nextLine();
         System.out.print("Enter Category :");
         category=sc.nextLine();
         System.out.print("Enter Price : ");
         price=sc.nextInt();
         sc.nextLine();
         System.out.print("Enter Region : ");
         region=sc.nextLine();
         
         if("North".equals(region)||"East".equals(region))
         {
             if("Electronics".equals(category))
             {
                taxrate=price*18/100;
                discount=price*10/100;
             }
             else if("Clothing".equals(category))
             {
               taxrate=price*5/100;
                discount=price*12/100;
             }
             else if ("Furniture".equals(category))
             {
               taxrate=price*12/100;
                discount=price*8/100;
             }
             else if("Automobiles".equals(category))
             {
               taxrate=price*28/100;
                discount=price*15/100;
             }
         }
         else if("South".equals(region)||"West".equals(region))
         {
            if("Electronics".equals(category))
             {
                taxrate=price*16/100;
                discount=price*10/100;
             }
             else if("Clothing".equals(category))
             {
                taxrate=price*4/100;
                discount=price*12/100;
             }
             else if ("Furniture".equals(category))
             {
                taxrate=price*10/100;
                discount=price*8/100;
             }
             else if("Automobiles".equals(category))
             {
                taxrate=price*26/100;
                discount=price*15/100;
             }
         }
         finalprice=price-discount+taxrate;
         
         System.out.println("tax :"+taxrate);
         System.out.println("didcount :"+discount);
         System.out.println(" total price :"+finalprice);
         
         sql="insert into products values("+productid+",'"+pname+"','"+category+"',"+price+","+discount+",'"+region+"',"+taxrate+","+finalprice+")";
         stmt.executeUpdate(sql);
         System.out.print("Data Save ");
         
       
        }
        catch(SQLException e)
        {
          System.out.println("Error : "+e);
        }
        catch(Exception e)
        {
          System.out.println("Error : "+e);
        }
    }
    
}
