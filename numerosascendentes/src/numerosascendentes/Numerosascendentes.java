package numerosascendentes;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class Numerosascendentes {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
        
        if(a>b && a>c)
            if (b>c)
                JOptionPane.showMessageDialog(null, a+"\n"+b+"\n"+c);
            else
                JOptionPane.showMessageDialog(null, a+"\n"+c+"\n"+b);
        else 
            if(b>a && b>c)
                if(c>a)
                    JOptionPane.showMessageDialog(null, b+"\n"+c+"\n"+a);
                else
                    JOptionPane.showMessageDialog(null, b+"\n"+a+"\n"+c);
            else 
                if (c>a && c>b)
                    if(a>b)
                        JOptionPane.showMessageDialog(null, c+"\n"+a+"\n"+b);
                    else
                        JOptionPane.showMessageDialog(null, c+"\n"+b+"\n"+a);
                
    }
    
}
