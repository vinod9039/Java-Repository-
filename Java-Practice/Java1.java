public class file1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
          Scanner sc=new Scanner(System.in);
          String fname,data;
          System.out.print("Enter file name ");
          fname=sc.nextLine();
          fname+=".txt";
          System.out.print("Enter data ");
          data=sc.nextLine();
          FileWriter fw=new FileWriter(fname);
          fw.write(data);
          fw.append(data);
          System.out.println("Your Data save successfully.");
          fw.close();
          
        }
        catch(IOException e)
        {
          System.out.println("Erro"+e);
          
        }
    }
    
}

