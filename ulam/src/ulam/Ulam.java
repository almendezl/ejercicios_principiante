
package ulam;

import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Ulam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
       
        Scanner datos = new Scanner (System.in);
        System.out.println("Ingrese un numero entero: ");
        numero = datos. nextInt();
        Scanner s = new Scanner (System.in);
            
        if(numero>0){
        while(numero!=1){
            System.out.println(numero);
            if(numero%2==0){
            numero=numero/2;
            }else{
            numero=numero*3+1;
            }
        
        }
            System.out.println(numero);
        }
        else{
            System.out.println("ERROR. El numero debe ser un entero positivo.");
        } 
    }
    }
    

