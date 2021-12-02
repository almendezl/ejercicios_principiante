package raicesdeunaecuacion;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class Raicesdeunaecuacion {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double o;
        double resul1;
        double resul2;
     Scanner datos=new Scanner(System.in);
        System.out.println("Ingrese el numero correspondiente a 'a': ");
        a=datos.nextDouble();
        System.out.println("Ingrese el numero correspondiente a 'b': ");
        b=datos.nextDouble();
        System.out.println("Ingrese el numero correspondiente a 'c': ");
        c=datos.nextDouble();
        if((4*a*c) > (b*b)){
            System.out.println("Las raices de la ecuacion cuadratica son imaginarias.");
        }else if (a>0 || a<0){
            
            o=(b*b)-4*a*c;
            resul1=(-b)+(Math.pow(o, 0.5));
            resul1=resul1/(2*a);
            resul2=((-b)-(Math.pow(o,0.5)))/(2*a);
                System.out.println("Las raices son:\n"+resul1+"\n"+resul2);
        }
                else{
                System.out.println("Error. ");
                System.exit(0);
        }
            
        
    }
    
}
