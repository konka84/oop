
package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class FileWrite {
    public static void main (String[] args) {
        
        String k,m;
        try{
        Formatter formatter = new Formatter("C:/Users/USER/Documents/NetBeansProjects/File/Konka.txt");
     Scanner input = new Scanner(System.in);
    
       k=input.nextLine();
       
      
            
         formatter.format("%s\r\n",k);
            
            formatter.close();   
            
        } catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    
}
