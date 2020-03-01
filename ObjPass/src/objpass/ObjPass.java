/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objpass;

/**
 *
 * @author USER
 */
public class ObjPass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ObjPass p = new ObjPass();
        p.value = 5;
        System.out.println("Before calling: " + p.value);
        increment(p);
        System.out.println("After calling: " + p.value);       
    }
    public static void increment(ObjPass a){
        a.value++;
    }
    private int value;
    
}
