/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com;
import java.util.*;
import java.io.*;

/**
 *
 * @author user
 */
public class Bookmain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Book b=new Book();
        Scanner sc=new Scanner(System.in);
        String bookname;
        int no,no1;
        
        System.out.print("Enter Book name : ");
        bookname=sc.nextLine();
        System.out.print("Enter Book no : ");
        no=sc.nextInt();
        b.setbook(bookname,no);
        b.getbook();
        try
        {
            int c ;
            String ch=" ";
            FileWriter fw=new FileWriter("c:/intel/vijay.txt",true);
            no1=b.bookno();
            fw.write(" "+no1+".");
             fw.write(b.bookname()+" ");
            fw.close();
            System.out.println("File Saved Successful ");
            System.out.print("Do you need to read the file :");
            ch=sc.next();
            //System.out.println(ch);
         
         if("yes".equals(ch)||"Yes".equals(ch))
         {

            FileReader fr=new FileReader("c:/intel/vijay.txt");
             while((c=fr.read())!=-1)
             {
               System.out.print((char)c);
             }
             System.out.println();
               fr.close();  
         }
         else
             System.out.println("ok");
        }
        catch(IOException e)
        {
          System.out.print("File not saved"+e);
        }
    }
    
}
