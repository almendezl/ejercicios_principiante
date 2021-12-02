/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldocase;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class Sueldocase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n;
        int cat;
        double s;
        n=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        cat=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la categoria: \n1\n2\3\n4\n5"));
        switch (cat){
            case 1:
            s=1500000;
            JOptionPane.showMessageDialog(null, "El nombre del empleado es: "+ n+"\nLa categoria es: "+cat+"\nEl sueldo total es: "+s);
                break;
            case 2:
                s=2500000;
                JOptionPane.showMessageDialog(null, "El nombre del empleado es: "+ n+"\nLa categoria es: "+cat+"\nEl sueldo total es: "+s);
                break;
            case 3:
                s=3500000;
                JOptionPane.showMessageDialog(null, "El nombre del empleado es: "+ n+"\nLa categoria es: "+cat+"\nEl sueldo total es: "+s);
                break;
            case 4:
                s=4500000;
                JOptionPane.showMessageDialog(null, "El nombre del empleado es: "+ n+"\nLa categoria es: "+cat+"\nEl sueldo total es: "+s);
                break;
            case 5:
                s=5500000;
                JOptionPane.showMessageDialog(null, "El nombre del empleado es: "+ n+"\nLa categoria es: "+cat+"\nEl sueldo total es: "+s);
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Error de categoria");break;
                
             
    }
         
        
    }
    
}
