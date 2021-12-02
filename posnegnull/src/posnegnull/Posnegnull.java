/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posnegnull;

import javax.swing.JOptionPane;

/**
 *
 * @author Angie Mendez
 */
public class Posnegnull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lee un dato y determina si es positivo, negativo o nulo
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if(numero==0)
                 JOptionPane.showMessageDialog(null, "El numero es nulo: "+numero);
                if(numero>0)
                    JOptionPane.showMessageDialog(null,"El numero es positivo: "+numero);
                   if(numero<0)
                    JOptionPane.showMessageDialog(null, "El numero es negativo: "+numero);
            
    }
    
}
