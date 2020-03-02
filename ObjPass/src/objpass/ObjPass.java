
package objpass;

public class ObjPass {

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
