package calculadorabasica;
import java.util.Scanner;   
/**
 *
 * @author Angie Mendez
 */
public class CalculadoraBasica {
    static Scanner datos = new Scanner(System.in);

static double suma (double numero1, double numero2){
        return numero1 + numero2;
    }
    static double resta (double numero1, double numero2){
        return numero1 - numero2;
    }
    static double multiplicacion (double numero1, double numero2){
        return numero1 * numero2;
    }
    static double division (double numero1, double numero2){
        return numero1 / numero2;
    }
    static double modulo (double numero1, double numero2){
        return numero1 % numero2;
    }
        static int potencia(double numero1, double numero2){
        int base=(int) numero1;
        int expo=(int) numero2;
        int result=1;
        for(int i=0;i<expo;i++){
            result+=base;
        }
        return result;
    }
        static double absoluto(double numero1){
             return numero1<0?-numero1:numero1;
        }
    static double pedirNumero(){
        System.out.println("Ingrese un número: ");
        return datos.nextDouble();   
    }
    static double raizCuadrada(double numero1){
    return Math.sqrt(numero1);
    }
    static double raizN(double numero1, double indice){
    return Math.pow(numero1,1/indice);
    }
    public static void main(String[] args) {
                 
        double num1, num2, resultado;
        String operacion;
        
        System.out.println("Seleccione la operación: \n+.suma\n-.resta\n*.multiplicacion\n/.division\n%.modulo\npot.Potencia\nabs. Valor absoluto\nr2. Raiz cuadrada\nrn. Raiz enesima");
        operacion = datos.next();
        
        switch(operacion){
            case "+":
                num1 = pedirNumero();
                num2 = pedirNumero();
                resultado = suma(num1,num2);
                System.out.println(num1 + operacion + num2 + " = " + resultado);
                break;
                
            case "-":
                num1 = pedirNumero();
                num2 = pedirNumero();
                resultado = resta(num1,num2);
                System.out.println(num1 + operacion + num2 + " = " + resultado);
                break;
                
            case "*":
                num1 = pedirNumero();
                num2 = pedirNumero();
                resultado = multiplicacion(num1,num2);
                System.out.println(num1 + operacion + num2 + " = " + resultado);
                break;
                
            case "/":
                num1 = pedirNumero();
                num2 = pedirNumero();
                if (num2!=0){
                    resultado = division(num1,num2);
                    System.out.println(num1 + operacion + num2 + " = " + resultado);
                }else
                    System.out.println("ERROR, division por 0");
                break;
                
            case "%":
                num1 = pedirNumero();
                num2 = pedirNumero();
                if (num2!=0){
                    resultado = modulo(num1,num2);
                    System.out.println(num1 + operacion + num2 + " = " + resultado);
                }else
                    System.out.println("ERROR, modulo por 0");
                break;
            case "pot":
                num1=pedirNumero();
                num2=pedirNumero();
                if(num2>=0){
                resultado=potencia(num1,num2);
                System.out.println(resultado);
                }else
                    System.out.println("La potencia no debe ser negativa");
                break;
            case "abs":
                num1=pedirNumero();
                resultado=absoluto(num1);
                System.out.println("El valor absoluto del numero es: "+resultado);
                break;
            case "r2":
                num1=pedirNumero();
                
                if(num1>0){
                    resultado=raizCuadrada(num1);
                System.out.println("La raiz cuadrada del numero es: "+resultado);
                }else
                    System.out.println("Error, raiz cuadrada para numeros positivos");
                    break;
            case "rn":
                num1=pedirNumero();
                num2=pedirNumero();
                resultado=raizN(absoluto(num1),absoluto(num2));
                System.out.println("La raiz: "+resultado);
                break;
        }
    
    }
}
