/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Deshighee extends Product{
    int contity;

    public Deshighee(String productname,String exp,int contity) {
        super(productname,exp);
        this.contity = contity;
    }
    
     void getdeshighee()
    {
        super.getproduct();
      System.out.println("Contity : "+contity+"gram");
    }
    
    
}
