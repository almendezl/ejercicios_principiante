/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Angie Mendez
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "";
        double mediana=0, media=0, moda;
        int max, min;
        int notas[]=new int [100];
 
 for(int i=0; i<notas.length; i++){
     notas[i]=(int)(Math.random()*6);
     }       
 for(int i=0; i<notas.length; i++){
    
     a+=notas[i]+" ";
     if ((i+1)%10==0)
         a+='\n';
 }
 
 JOptionPane.showMessageDialog(null, a);
 
 //
 min=notas[0];
 max=notas[0];
 for(int i=1; i<notas.length; i++){
     if(notas[i]<min)
         min=notas[i];
     else if(notas[i]>max)
         max=notas[i];
 
 }
     
        
 for(int i=0; i<notas.length; i++){
     media+=notas[i];    
 }
 media/=notas.length;
 //Ordenar el arreglo antes de calcular la mediana. Use un algoritmo de ordenamiento burbuja, insercion o seleccion
 if(notas.length%2!=0)
     mediana=notas[notas.length/2];
else
     mediana=(notas[notas.length/2-1]+notas[notas.length/2])/2;
 
    }
    
    }
    

