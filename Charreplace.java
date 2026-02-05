/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pakage;

/**
 *
 * @author user
 */
public class Charreplace {
    String str;
    
    
    public Charreplace(String str)
    {
       this.str=str;
    }
    public void replacechar(char ch,char ch1)
    {
        StringBuilder sb=new StringBuilder(str);
    for(int i=0;i<str.length();i++)
    {
             if(ch==sb.charAt(i))
             {
                 
                  sb.setCharAt(i, ch1);
                  break;
                  
             }
    }
    str=sb.toString();
    System.out.println(""+str);
    }
    
    public void str(String ch,String ch1)
    {
         // Knowledge=Knowledge.replace(ch, ch1);
          str=str.replace(ch, ch1);
          System.out.println(""+str);
    }
    
}
