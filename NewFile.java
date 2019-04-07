
package file;

import java.io.File;
public class NewFile {
    public static void main(String[] args){
    File dir= new File("Konka");
    dir.mkdir();
    String path = dir.getAbsolutePath();
    File  File1st = new File(path+"/Konka.txt");
    try{
    File1st.createNewFile(); 
    System.out.println("Files are created");
    }
    
    
    catch(Exception k){
    System.out.println("k");
}   
}
}
    



















]
