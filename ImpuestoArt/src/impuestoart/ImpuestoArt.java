package impuestoart;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class ImpuestoArt {

    public static void main(String[] args) {
        double preBas;
        double imp;
        double tot;
        System.out.println("Ingrese el precio basico: ");
        Scanner datos = new Scanner(System.in);
        preBas = datos.nextDouble();
        if(preBas>500){
            imp = 20*0.30+(preBas-40)*0.5;
            
        }else if(preBas>40){
            imp = 20*0.30+(preBas-40)*0.4;
        }else if(preBas>20){
            imp = (preBas-20)*0.3;
        }else{
            imp=0;
        }
        tot=preBas+imp;
        System.out.println("El precio basico del producto es: "+ preBas+"\nEl impuesto es de: "+imp+ "\nEl costo total es: "+ tot);
    }
    
}
