package descuentocompra;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Descuentocompra {
    public static void main(String[] args) {
        double compra,neto;
        double descuento=0;
        Scanner datos= new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        compra=datos.nextDouble();
        if(compra>=15000){
            descuento=(compra*25)/100;
            neto=compra-descuento;
            System.out.println("El valor de su compra es: "+compra + "\nEl descuento es: "+ descuento+"\nEl valor total es: "+neto);
        }
        else if(compra>=7000 && compra<15000){
                    descuento=(compra*18)/100;
                    neto=compra-descuento;
                    System.out.println("El valor de su compra es: "+compra + "\nEl descuento es: "+ descuento+"\nEl valor total es: "+neto);
        }
        else if(compra>=1000 && compra<7000){
                        descuento=(compra*11)/100;
                        neto=compra-descuento;
                         System.out.println("El valor de su compra es: "+compra + "\nEl descuento es: "+ descuento+"\nEl valor total es: "+neto);
         }
         else if(compra>500 && compra<1000){
                            descuento=(compra*5)/100;
                            neto=compra-descuento;
                            System.out.println("El valor de su compra es: "+compra + "\nEl descuento es: "+ descuento+"\nEl valor total es: "+neto);
         }
         else if(compra==500){
                                neto=compra-descuento;
                                System.out.println("El valor de su compra es: "+compra + "\nEl descuento es: 0"+"\nEl valor total es: "+compra);
         }
         else
        System.out.println("Error");          
    }
}
