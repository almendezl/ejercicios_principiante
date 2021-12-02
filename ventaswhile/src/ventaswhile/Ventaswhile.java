package ventaswhile;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Ventaswhile {
    public static void main(String[] args) {
        double costo;
        int n, i=1;
        double ventas=0, ventas2=0, ventas3=0;
        Scanner datos= new Scanner (System.in);
        System.out.println("Ingrese la cantidad de ventas: ");
        n=datos.nextInt();
        
        while(i<=n){
            System.out.println("Ingrese el costo del producto: ");
            costo=datos.nextDouble();
            if(costo<=200){
            ventas+=1;
            }
            else if(costo>200 && costo<400){
            ventas2+=1;
            }
            else if(costo>=400){
            ventas3+=1;
            }
            i++;   
        }
        System.out.println("El total de ventas correspondientes a: "+"\n"+ventas+"\n"+ventas2+"\n"+ventas3);
    }  
}