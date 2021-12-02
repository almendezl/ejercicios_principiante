package numeroperfecto;
import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class NumeroPerfecto {
    public static void main(String[] args) {
        int numero;
        int i=1;
        System.out.println("Ingrese un numero: ");
        Scanner datos = new Scanner(System.in);
        numero = datos.nextInt();
        if(numero<8129){
        while(i <= numero){
            int suma = 0, j = 1;
            while(j <= (i/2)){
                if((i%j) == 0){
                    suma = suma+j;
                    j = j+1;
                }else{j=j+1;}
            }
            if(suma == i){
               
                System.out.println( i+" Es un numero perfecto");
                i++;
            }else{i++;}
        }
        }else
            System.out.println("Numero no valido");
            
       /* int np = 1;
        String numerosp = "";
        int n = 1;
        int suma=0;
        while(np<5)
        {
            n++;
            for(int x=1;x<n;x++)
            {
                if(n%x==0)
                {
                   suma=suma+x; 
                }
            }
            if(suma==n)
            {
                np=np+1;
                numerosp=numerosp+suma+", ";
                suma=0;
            }
            else
            {
                System.out.println("El numero: "+n+" NO ES Perfecto");
                suma=0;
            }
        }
        System.out.println("Numeros Perfecto: "+numerosp);*/
    }
    
    
}
