package votosarreglo;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class VotosArreglo {
    public static void main(String[] args) {
        int votos [] = new int [12];
        int voto;
        int suma=0;
        for(int i=0; i<12;i++){
            votos[i]=0;
        }
        voto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el voto"));
        while(voto !=-1){
            suma+=1;
            switch(voto){
                case 1: votos[0]+=1;
                    break;
                case 2:votos[1]+=1;
                    break;
                case 3:votos[2]+=1;
                    break;
                case 4:votos[3]+=1;
                    break;
                case 5:votos[4]+=1;
                    break;
                case 6:votos[5]+=1;
                    break;
                case 7:votos[6]+=1;
                    break;
                case 8:votos[7]+=1;
                    break;
                case 9:votos[8]+=1;
                    break;
                case 10:votos[9]+=1;
                    break;
                case 11:votos[10]+=1;
                    break;
                case 12:votos[11]+=1;
                    break;
                default: System.exit(0);  
            } 
            voto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el voto"));
        }
        for(int i=0; i<12;i++){
            System.out.println("Votos del candidato "+(i+1)+":  "+votos[i]);
        }
        System.out.println("\nEl total de votos es: "+suma);
    }
    
}
