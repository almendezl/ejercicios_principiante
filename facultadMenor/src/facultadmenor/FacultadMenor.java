package facultadmenor;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class FacultadMenor {
    public static void main(String[] args) {
    int matricula;
    String carrera;
    int semestre;
    double promedio;
    matricula=Integer.parseInt(JOptionPane.showInputDialog(
            "Ingrese su matricula:"));
    carrera = JOptionPane.showInputDialog(
            "Ingrese la carrera en la que esta inscrito:");
    semestre = Integer.parseInt(JOptionPane.showInputDialog(
            "Ingrese su semestre:"));
    promedio=Double.parseDouble(JOptionPane.showInputDialog(
            "Ingrese su promedio:"));
    switch(carrera){
        case "economia":
            if(semestre >=6 && promedio >= 8.8){
                JOptionPane.showMessageDialog(null,matricula+"\n"+
                        carrera+"\nACEPTADO");
            }
            else{
                JOptionPane.showMessageDialog(null,"NO ACEPTADO");
            }
            break;
        case "computacion":
            if(semestre >=6 && promedio >= 8.5){
                JOptionPane.showMessageDialog(null,matricula+"\n"+
                        carrera+"\nACEPTADO");
            }
            else{
                JOptionPane.showMessageDialog(null,"NO ACEPTADO");
            }
            break;
        case "administracion": case "contabilidad":
            if(semestre >=5 && promedio >= 8.5){
                JOptionPane.showMessageDialog(null,matricula+"\n"+
                        carrera+"\nACEPTADO");
            }
            else{
                JOptionPane.showMessageDialog(null,"NO ACEPTADO");
            }
            break;
        default:
                JOptionPane.showMessageDialog(null, "ERROR DE CARRERA");
            break;
    }
    }  
}