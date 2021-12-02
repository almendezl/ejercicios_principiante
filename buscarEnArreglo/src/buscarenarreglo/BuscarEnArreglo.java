package buscarenarreglo;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class BuscarEnArreglo {
    public static void main(String[] args) {
        String salida="";
        int clave;
        int cantidad=0;
        int encontrado=-1;
        int numeros[]=new int[10];
        for(int i=0; i<numeros.length;i++)
          numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato #"+(i+1)));
        //para buscar si un dato esta 
        for(int i=0; i<numeros.length;i++)
          salida+="pos"+(i+1)+": "+numeros[i]+"\n";
           JOptionPane.showMessageDialog(null, salida);
           //para contar cuantas veces esta un dato en el arreglo y la ultima posicion 
        clave=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea buscar "));
            for(int i=0; i<numeros.length;i++)
                if(clave==numeros[i])
                    encontrado=i;
                    cantidad++;
            if(encontrado<0)
                    JOptionPane.showMessageDialog(null, "El dato no fue encontrado");
            else 
                
                JOptionPane.showMessageDialog(null, "\nEl numero de veces que esta el numero es: "+cantidad +"\nLa ultima posicion fue: "+(encontrado+1));
            //para conocer la posicion del primer numero multiplo de tres
            for(int i=0; i<numeros.length;i++)
                if (numeros[i]%3==0){
                    encontrado=i;break;
            }
            int i=0;
            do{
                if (numeros[i]%3==0){
                    encontrado=i;
                i++;
            }
            }while(encontrado=-1 && i<numeros.length);
            
             if (encontrado <0)
                 JOptionPane.showMessageDialog(null, "El dato no fue encontrado");
             else 
                 JOptionPane.showMessageDialog(null, "Se encontro un multiplo de 3 en la posicion: ");
    
    
}
