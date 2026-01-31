/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.sql.*;
public class jdbc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
            Statement stmt= con.createStatement();
            Scanner sc=new Scanner(System.in);
            
            int employeeid = 0,pScore ,count=0;
            float salary, bonusP = 0,Allowance = 0,taxrate = 0,totalsalary = 0;
            String name ,department,sql;
            
            
             sql="select count(*) from employee";
             ResultSet rs=stmt.executeQuery(sql);
             rs.next();
             count=rs.getInt(1);
       // System.out.println(""+count);
        if(count==0)
        {
           count++;
            employeeid=count;
            System.out.println("count :"+count);
            
        }
        else 
        {
          sql="select max(employee_id) from employee"; 
          rs=stmt.executeQuery(sql);
          rs.next();
          employeeid=rs.getInt(1);
          //System.out.println("Epployee Id :"+employeeid);
          employeeid++;
          
        
        }
         
            System.out.println("Employee ID :"+employeeid);
            System.out.print("Enter Employee Name : ");
            name=sc.nextLine();
            System.out.print("Enter Department : ");
            department=sc.nextLine();
            System.out.print("Enter Salary : ");
            salary=sc.nextFloat();
            System.out.print("Enter a performance Scroe : ");
            pScore=sc.nextInt();
             
            if("HR".equals(department))
            {
             Allowance=1100;
             bonusP=salary*7/100;
             taxrate=1000;
            }   
            else if ("Engi".equals(department))
            {
              Allowance=900;
              bonusP=salary*5/100;
              taxrate=800;
              
            }
            totalsalary=salary+bonusP+Allowance;
            sql="insert into employee values("+employeeid+",'"+name+"',"+salary+","+pScore+",'"+department+"',"+bonusP+","+Allowance+","+taxrate+","+totalsalary+")";
            stmt.executeUpdate(sql);
            System.out.println("Data Save");
            System.out.println("====================================================================");
            System.out.println("Employee ID : "+employeeid);
            System.out.println("Employee Name : "+name);
            System.out.println("Department : "+department);
             System.out.println("Taxt Rate : "+taxrate);
            System.out.println("Salary : "+salary);
            System.out.println("Bonus Point :"+bonusP);
            System.out.println("ALlowance : "+Allowance);
            System.out.println(" Total Salary : "+totalsalary);
               
        }
        catch(SQLException e)
        {
          System.out.println("Error :"+e);
                  
        }
        catch(Exception e)
        {
          System.out.println("Error : "+e);
        }
    }
    
}
