package ordendecre;
import java.util.Scanner;
public class Ordendecre {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int numero3;
        
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1=datos.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2=datos.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numero3=datos.nextInt();
        
        if(numero1<numero2)
            System.out.println("El orden no es descendente");
        else
            System.out.println("El orden es descendente");
        
    }
    
}
