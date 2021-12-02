/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aumentosueldo;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class Aumentosueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sueldo;
        double nomina=0;
        sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado"));
        while(sueldo !=-1){
        if (sueldo<1000){
            sueldo=sueldo+(sueldo*0.15);
            nomina+=sueldo;
            JOptionPane.showMessageDialog(null, "El sueldo neto es: "+ sueldo+"\nLa nomina total es: "+nomina);
        sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado"));
        
        }else if(sueldo>=1000){
            sueldo=sueldo+(sueldo*0.12);
            nomina+=sueldo;
            JOptionPane.showMessageDialog(null, "El sueldo neto es: "+ sueldo+"\nLa nomina total es: "+nomina);
        sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado"));
        }
        
        
        
        
        }
    }
    
}
