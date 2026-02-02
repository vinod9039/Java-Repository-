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
    String Knowledge;
    
    
    public Charreplace(String knowledeg)
    {
       this.Knowledge=knowledeg;
    }
    public void replacechar(char ch,char ch1)
    {
        StringBuilder sb=new StringBuilder(Knowledge);
    for(int i=0;i<Knowledge.length();i++)
    {
             if(ch==sb.charAt(i))
             {
                 
                  sb.setCharAt(i, ch1);
                  break;
                  
             }
    }
    Knowledge=sb.toString();
    System.out.println(""+Knowledge);
    }
    
    public void str(String ch,String ch1)
    {
         // Knowledge=Knowledge.replace(ch, ch1);
          Knowledge=Knowledge.replace(ch, ch1);
          System.out.println(""+Knowledge);
    }
    
}
