package costollamadas;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Costollamadas {

    public static void main(String[] args) {
       
        double minutos;
        double costo;
        int clave;
        Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese el numero de minutos hablados");
        minutos=datos.nextDouble();
        System.out.println("Ingrese la zona destino:"
                + "\n12: America del Norte"
                + "\n15: America central"
                + "\n18: America del sur"
                + "\n19: Europa"
                + "\n23: Asia"
                + "\n25: Africa"
                + "\n29: Oceania");
        clave=datos.nextInt();
        switch(clave){
                case 12:
                    costo=minutos*2;
                    System.out.println("La cantidad de minutos es: "+minutos+"\nLa zona seleccionada es: "+clave+"\nEl costo total es: "+costo);
                    break;
                case 15:
                    costo=minutos*2.2;
                    System.out.println("La cantidad de minutos es: "+minutos+"\nLa zona seleccionada es: "+clave+"\nEl costo total es: "+costo);
                    break;
                case 18:
                    costo=minutos*4.5;
                    System.out.println("La cantidad de minutos es: "+minutos+"\nLa zona seleccionada es: "+clave+"\nEl costo total es: "+costo);
                    break;
                case 19:
                    costo=minutos*3.5;
                    System.out.println("La cantidad de minutos es: "+minutos+"\nLa zona seleccionada es: "+clave+"\nEl costo total es: "+costo);
                    break;
                case 23:
                    costo=minutos*6;
                    System.out.println("La cantidad de minutos es: "+minutos+"\nLa zona seleccionada es: "+clave+"\nEl costo total es: "+costo);
                    break;
                case 25:
                    costo=minutos*6;
                    System.out.println("La cantidad de minutos es: "+minutos+"\nLa zona seleccionada es: "+clave+"\nEl costo total es: "+costo);
                    break;
                case 29:
                    costo=minutos*5;
                    System.out.println("La cantidad de minutos es: "+minutos+"\nLa zona seleccionada es: "+clave+"\nEl costo total es: "+costo);
                    break;
                default:
                    System.exit(0);
                        }
        
    }
    
}
