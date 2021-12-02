/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubonumeros;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Cubonumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, cubo;
        Scanner datos = new Scanner(System.in);
        cubo=0;
        System.out.println("Ingrese un numeo natural");
        numero=datos.nextInt();
        while(numero!=-1){
        cubo=(int)Math.pow(numero,3);
        System.out.println("El cubo del numero ingresado es: "+cubo);
        
        System.out.println("Ingrese un numeo natural");
        numero=datos.nextInt();
        }
    }
    
}
