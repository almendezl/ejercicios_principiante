package prob39;

import javax.swing.JOptionPane;

/**
 *
 * @author Angie Mendez
 */
public class Prob39 {
    //el siguiente programa calcula la serie de la potencia desde 1 hasta un numero dado
    public static void main(String[] args) {
    int num, suma=0;
    num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
    for(int i=0; i<num;i++){
        suma+=(int)Math.pow((i+1), (i+1));
    }
    JOptionPane.showMessageDialog(null, suma);
    }
    
}
