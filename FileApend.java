/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileHandling;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.Scanner;
public class FileApend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
        Scanner sc=new Scanner(System.in);
        String str,data;
        System.out.print("Enter a File name : ");
        str=sc.nextLine();
        System.out.println("Enter Data :");
        data=sc.nextLine();
        FileWriter fw=new FileWriter(str+".txt");
        fw.write(data);
        fw.close();
        }
        catch(IOException e)
        {
          System.out.println("Error :"+e);
        }
        
    }
    
}
