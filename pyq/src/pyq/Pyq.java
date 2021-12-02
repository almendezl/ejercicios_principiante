/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyq;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class Pyq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p;
        int q;
        p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        q=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        if ((Math.pow(p,3)+Math.pow(q,4)-2*Math.pow(p,2))<630)
            JOptionPane.showMessageDialog(null, "El valor del primer numero es: "+p+"\nEl valor del segundo numero es: "+q);
            
     }
    
}