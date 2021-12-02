/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Numeromayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1;
        double numero2;
        double numero3;
        
        Scanner datos= new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        numero1=datos.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2=datos.nextDouble();
        System.out.println("Ingrese el tercer numero");
        numero3=datos.nextDouble();
        if(numero1>numero2)
            if(numero1>numero3)
                System.out.println("El numero 1 es el mayor");
            else if(numero1==numero3)
                System.out.println("El numero 1 y el numero 3 son los mayores");
                else
                System.out.println("El numero 3 es el mayor");
        //no esta terminado
        
                
    }
    
}
