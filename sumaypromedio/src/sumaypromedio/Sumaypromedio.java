/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaypromedio;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Sumaypromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma=0;
        int numero;
        double promedio=0;
        Scanner datos = new Scanner(System.in);
        
        for(int i=0; i<270;i++){
        
            System.out.println("Ingrese el numero "+(i+1));
            numero=datos.nextInt();
            if(numero!=0){
                if(numero%2==1){
                suma=suma+numero;
                }
                else{
                promedio=(promedio+numero)/(135);
                }
                    
            }
        
        }
        System.out.println(suma+"\n"+promedio);
    }
    
}
