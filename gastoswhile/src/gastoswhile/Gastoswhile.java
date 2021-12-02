/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastoswhile;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Gastoswhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma;
        double gastos;
        Scanner datos=new Scanner(System.in);
        suma=0;
        System.out.println("Ingrese el valor del gasto");
        gastos=datos.nextDouble();
        while(gastos!=-1){
            suma=suma+gastos;
            System.out.println("Ingrese el valor del gasto");
        gastos=datos.nextDouble();
            
        
        }
        System.out.println(suma);
    }
    
}
