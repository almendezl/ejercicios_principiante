package monedasybilletes;
import javax.swing.JOptionPane;

/**
 *
 * @author Angie Mendez
 */
public class MonedasyBilletes {
    public static void main(String[] args) {
        int precio, dinero, cambio;
        dinero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del dinero ingresado"));
        precio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        cambio=dinero - precio;
        if(precio >= dinero){
            JOptionPane.showMessageDialog(null, "El dinero no es suficiente para cancelar el producto, le faltan: "+ -cambio);
        }
        else if(dinero!=100000 && dinero!=50000 && dinero!=20000 && dinero!=10000 && dinero!=5000 && dinero!=2000 && dinero!=1000 &&
                dinero!=500 && dinero!=200 && dinero!=100 && dinero!=50){
            System.out.println("Error, valor de dinero ingresado incorrecto");
            }else{   
                System.out.println("Le será devuelto:"+"\n"+cambio/50000+" Billetes de $50.000");
                cambio=cambio%50000;
                System.out.println(cambio/20000+" Billetes de $20.000");
                cambio=cambio%20000;
                System.out.println(cambio/10000+" Billetes de $10.000");
                cambio=cambio%10000;
                System.out.println(cambio/5000+" Billetes de $5.000");
                cambio=cambio%5000;
                System.out.println(cambio/2000+" Billetes de $2.000");
                cambio=cambio%2000;
                System.out.println(cambio/1000+" Billetes de $1.000");
                cambio=cambio%1000;
                System.out.println( cambio/500+" Monedas de $500");
                cambio=cambio%500; 
                System.out.println(cambio/200+" Monedas de $200");
                cambio=cambio%200;
                System.out.println( cambio/100+" Monedas de $100");
                cambio=cambio%100;
                System.out.println(cambio/50+" Monedas de $50");
        }
    }
    
}
