
package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FileRead {
      public static void main (String[] args) {
           
   
          try{
              File  File1st = new File("C:/Users/USER/Documents/NetBeansProjects/File/Konka.txt");
             Scanner scanner = new Scanner(File1st);
   while(scanner.hasNext()){
       String k= scanner.nextLine();
       System.out.println("Your String is:"+k);
   
    }
   scanner.close();
          }
          catch(FileNotFoundException e){
            System.out.println(e);
        }
    
        
    
}
}