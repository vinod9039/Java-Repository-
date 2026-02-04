/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author user
 */
public class Book {
    
   private int bookno;
   private String  bookname;
     void  setbook(String bookname,int bookno )
    {
       this.bookname=bookname;
       this.bookno=bookno;
       
    }
     public void getbook()
     {
          System.out.println("Book no : "+bookno);
          System.out.println("Book name : "+bookname);
     }
     public int bookno()
     {
        return bookno;
     }
     
     public String bookname()
     {
       return bookname;
     }
     
    
            
    
}
