/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String priNom;
        String apePat;
        int edad;
        double sueMen;
        Empleado empleados[] = new Empleado[2];
        Scanner datos = new Scanner(System.in);
        
        
        for(int i=0; i<empleados.length;i++){
            System.out.println("Ingrese el primer nombre: ");
            priNom = datos.next();
            System.out.println("Ingrese el apellido paterno: ");
            apePat = datos.next();
            System.out.println("Ingrese la edad: ");
            edad = datos.nextInt();
            System.out.println("Ingrese el sueldo Mensual: ");
            sueMen = datos.nextDouble();
            empleados[i] = new Empleado(priNom, apePat, edad, sueMen);
        }
        
        for(int i=0; i<empleados.length;i++){
            System.out.println("Primer nombre: "+empleados[i].getPrimerNombre()+
            " Apellido paterno: "+empleados[i].getApellidoPaterno()+" Edad: "+empleados[i].getEdad()+ " Salario Mensual: "+empleados[i].getSueldoMensual()*12 );
        }
        for(int i=0; i<empleados.length;i++){
            empleados[i].setSueldoMensual(empleados[i].getSueldoMensual()*1.1);
        }
        
        
        System.out.println("\nSALARIO CON AUMENTO: ");
        System.out.println("");
        for(int i=0; i<empleados.length;i++){
            System.out.println("Primer nombre: "+empleados[i].getPrimerNombre()+
            " Apellido paterno: "+empleados[i].getApellidoPaterno()+" Edad: "+empleados[i].getEdad()+ " Salario Mensual: "+empleados[i].getSueldoMensual()*12 );
        }
        
        
    }
    
}
