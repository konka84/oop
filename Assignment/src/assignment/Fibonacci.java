
package assignment;

import java.util.Scanner;
public class Fibonacci {
    
    public static void main(String[] args){
       
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the term:");
        int n = input.nextInt();
      System.out.println("The fibonacci series is:");
       
        for(int i=0;i<=n;i++){
          
       System.out.print(fibo(i)+" ");
        
    }
    }
   public static int fibo(int val){
       if(val==0) return 0;
       else if(val==1) return 1;
       else
           return(fibo(val-1)+fibo(val-2));
   }
}
