/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Product {
    String productname,exp;

    public Product(String productname,String exp) {
        this.productname=productname;
        this.exp=exp;
    }
    
     void getproduct()
    {
     System.out.println("Product name : "+productname);
     System.out.println("Expiry Date : "+exp);
    }
     
  
}
