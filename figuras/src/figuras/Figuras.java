/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        String c;// color
        double r;//radio
        Circulo arr[] = new Circulo[5];
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Ingrese el radio del circulo: ");
            r=in.nextDouble();
            System.out.println("Ingrese el color del circulo: ");
            c=in.next();
            arr[i] = new Circulo(r,c);
        }
        System.out.println("\nLos circulos alamcenados son: ");
        for(int i=0; i< arr.length;i++)
            System.out.println("Circulo-> radio"+arr[i].getRadio()+" diametro: "+arr[i].getDiametro()+" color: "+arr[i].getColor());
        // completar el area y perimetro
        
        //el arreglo el para almacenar objetos y debe ser del tipo del objeto
    }
    }
    

