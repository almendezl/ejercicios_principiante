/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nomina=0;
        double sueldo=0;
        for(int i=0;i<10;i++){
        sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del trabajador: "+(i+1)));
        nomina=nomina+sueldo;
        
        }
        JOptionPane.showMessageDialog(null,"La nomina total es: "+nomina);
            
    }
    
}
