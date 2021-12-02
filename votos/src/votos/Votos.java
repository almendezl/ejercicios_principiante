package votos;

import javax.swing.JOptionPane;

/**
 *
 * @author Angie Mendez
 */
public class Votos {
    public static void main(String[] args) {
        int cand1=0, cand2=0, cand3=0, cand4=0,voto;
        voto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el voto: "));
        while(voto!=0){
            switch(voto){
                case 1: cand1++; break;
                case 2: cand2++; break;
                case 3: cand3++; break;
                case 4: cand4++; break;
                default: JOptionPane.showMessageDialog(null, "Error");System.exit(0);
            }
        voto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el voto: "));
        }
        JOptionPane.showMessageDialog(null,"Los votos del candidato 1 son: "+cand1+
                "\nLos votos del candidato 2 son: "+cand2+
                "\nLos votos del candidato 3 son: "+cand3+
                "\nLos votos del candidato 4 son: "+cand4+
                "\nEl total de votantes es: "+ (cand1+cand2+cand3+cand4));
        
    }
    
}
