package mayorymenor;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Mayorymenor {
    public static void main(String[] args) {
        int c;
        int n;
        int ma;
        int me;
        
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nimeros a leer");
        c=datos.nextInt();
        
        System.out.println("Ingrese un numero ");
        n=datos.nextInt();
        me=n;
        ma=n;
        for (int i =1;i<c;i++){ 
            System.out.println("Ingrese un numero ");
        n=datos.nextInt();
        if(n<me)
            me=n;
        else
            if(n>ma)
                ma=n;
        }
        System.out.println("El numero mayor es: "+ ma);
        System.out.println("El numero menor es: "+ me);
    }
}