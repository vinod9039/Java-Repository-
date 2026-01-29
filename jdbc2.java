

/**
 *
 * @author user
 */
import java.sql.*;
import java.util.Scanner;
public class jdbc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
         DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
         Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
         Statement stmt=con.createStatement();
         
         int id,age,salary,ch=0;
         String Fristname,lastname,department,sql,ch1,insert;
         Scanner sc=new Scanner(System.in);
         
         System.out.println("1. Add  employees");
         System.out.println("2. update ");
         System.out.println("3. Delete Employee");
         do{
                System.out.println(" Enter choic 1-3 : ");
                ch=sc.nextInt();
                if(ch==1)
                {
                   for(int i=0;i<5;i++)
                    {
         
                       System.out.print("Enter Employee ID : ");
                       id=sc.nextInt();
                       sc.nextLine();
                       System.out.print("Enter Frist Name : ");
                       Fristname=sc.nextLine();
                       System.out.print("Enter last Name : ");
                       lastname=sc.nextLine();
                       System.out.print("Enter Age : ");
                       age=sc.nextInt();
                       sc.nextLine();
                       System.out.print("Enter Department : ");
                       department=sc.nextLine();
                       System.out.print("Enter Salary : ");
                       salary=sc.nextInt();
                       sql="insert into employees values("+id+",'"+Fristname+"','"+lastname+"',"+age+",'"+department+"',"+salary+")";
                       sc.nextLine();
                       stmt.executeUpdate(sql);
                       System.out.println("Data save");
                    }
               }
               else if (ch==2)
                {
                    System.out.println("1.Employee id ");
                    System.out.println("2.First name ");
                    System.out.println("3.last name ");
                    System.out.println("4.age ");
                    System.out.println("5.Department ");
                    System.out.println("6.salary ");
                    System.out.print("Enter choic : ");
                    ch=sc.nextInt();
                    System.out.println("Enter Employee ID : ");
                    id=sc.nextInt();
                    sc.nextLine();
             
                    if (ch==1)
                    {
                        System.out.print("Enter insert value : ");
                        insert=sc.nextLine();
                        sql="update employees set employee_id='"+insert+"' where employee_id=("+id+")";
                        stmt.executeUpdate(sql);
                        System.out.println("Update Empolyee ID ");
                    }
                    else if (ch==2)
                    {
                        System.out.print("Enter insert value : ");
                        insert=sc.nextLine();
                        sql="update employees set first_name='"+insert+"' where employee_id=("+id+")";
                        stmt.executeUpdate(sql);
                        System.out.println("Update Empolyee  first name  ");
                    }
                    else if (ch==3)
                    { 
                        System.out.print("Enter insert value : ");
                        insert=sc.nextLine();
                        sql="update employees set last_name='"+insert+"' where employee_id="+id+"";
                        stmt.executeUpdate(sql);
                        System.out.println("Update Empolyee last name ");
                    }
                    else if (ch==4)
                    {
                         System.out.print("Enter insert value : ");
                        insert=sc.nextLine();
                        sql="update employees set age="+insert+" where employee_id=("+id+")";
                        stmt.executeUpdate(sql);
                        System.out.println("Update Empolyee age");
                    }
                    else if (ch==5)
                    {
                        System.out.print("Enter insert value : ");
                        insert=sc.nextLine();
                        sql="update employees set department='"+insert+"' where employee_id="+id+"";
                        stmt.executeUpdate(sql);
                        System.out.println("Update Empolyee department");
                    }
                    else if (ch==6)
                    {   
                        System.out.print("Enter insert value : ");
                        insert=sc.nextLine();
                        sql="update employees set salary='"+insert+"' where employee_id=("+id+")";
                        stmt.executeUpdate(sql);
                        System.out.println("Update Empolyee salary ");
                    }
             
             
             
          
                }
                else if (ch==3)
                {
                    System.out.println("Enter ID : ");
                    id=sc.nextInt();
                    sql="delete from employees where salary<25000";
                    stmt.executeUpdate(sql);
                }
         
                 System.out.print("Do you want to continue : ");
                 ch1=sc.nextLine();
                 System.out.println(ch1);
            }while("yes".equals(ch1));
         
        }
        catch(SQLException e)
        {
          System.out.println("Error "+e);
        }
        catch(Exception e)
        {
          System.out.println("Error "+e);
        }
    }
    
}
