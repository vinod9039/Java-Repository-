/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Stack;
import java.util.Iterator;
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        
        System.out.println("Mathod 1");
        for(int i=0;i<s.size();i++)
            System.out.print(s.get(i));
          
        System.out.println("\nMathod 2");
        for(int x:s)
            System.out.print(x);
        
        
        System.out.println("\n Mathod 3 - Iterator ");
        Iterator<Integer> ii=s.iterator();
        while(ii.hasNext())
             System.out.println(ii.next());
        
        System.out.println("\n Mathod 4 -Labda Expression ");
        s.forEach(x->System.out.println(x));
        
        
        
    }   
    
}
