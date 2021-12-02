package sueldo;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class Sueldo {
    public static void main(String[] args) {
        double sueldo;
        int categoria;
        int horEx;
        int cosH;
        double tSueldo;
        sueldo = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingrese el sueldo del trabajador: "));
        categoria = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese la categoria del trabajador: "));
        if(categoria>=1){
            switch(categoria){
                case 1:
                    cosH=30;
                    break;
                case 2:
                    cosH=38;
                    break;
                case 3:
                    cosH=50;
                    break;
                case 4:
                    cosH=70;
                    break;
                default:
                    cosH=0;
                    break;
            }
            horEx = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese las horas extra: "));
            if(horEx>30){
                tSueldo = sueldo + 30 * cosH;
            }
            else{
                tSueldo = sueldo + horEx * cosH;
            }
            JOptionPane.showMessageDialog(null, "El sueldo a pagar de acuerdo al sueldo"
                    + " y las horas extras trabahadas es de:\n$   "+ tSueldo);
        }
        else{
            System.out.println("Error de categoria");
        }
            }
}