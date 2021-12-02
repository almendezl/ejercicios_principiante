package fibonacci;

/**
 *
 * @author Angie Mendez
 */
public class Fibonacci {
    public static void main(String[] args) {
        // TODO code application logic here
    int primero = 0;
    int segundo = 1 ;
    int siguiente;
        System.out.println("1");
    while(primero<1000000000){
        
        siguiente = primero + segundo;
        primero = segundo;
        segundo = siguiente;
        System.out.println(siguiente);
    }
    }
    
}
