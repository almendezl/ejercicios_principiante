package sumpositpromtotal;

import javax.swing.JOptionPane;

/**
 *
 * @author Angie Mendez
 */
public class Sumpositpromtotal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int cantidad=0,num,contPos=0,sumaPos=0;
    double sumTot=0;
    cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de datos que va a ingresar: "));
    for(int i=0; i<cantidad; i++){
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        sumTot+=num;
        if(num>=0){
            contPos+=1;
            sumaPos+=num;
        }
        
    }
    JOptionPane.showMessageDialog(null, "Los numeros positivos ingresados fueron: "+contPos+"\nLa suma de los numeros positivos es: "+sumaPos+
            "\nEl promedio de todos los numeros es: "+(sumTot/cantidad));
    }
    
}
