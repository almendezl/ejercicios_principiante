package codigou;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class Codigou {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);  
         String cod_completo;
         int n;
         int a;
         int p;
         System.out.println("Introduzca su codigo de 12 digitos: ");       
         cod_completo = sc.nextLine(); 
           
        switch (cod_completo.substring(0,2)) {
        case "10":
        System.out.println("Programa Ingenieria de Sistemas");
        break;
        case "20":
        System.out.println("Programa Ingenieria Ambiental");
        break;
        case "30":
        System.out.println("Programa Ingenieria Quimica");
        break;
        case "40":
        System.out.println("Programa Ingenieria Electronica");
        break;
         case "50":
        System.out.println("Programa Ingenieria Industrial");
        break;
         case "60":
        System.out.println("Programa Ingenieria Mecanica");
        break;
        case "70":
        System.out.println("Programa Ingenieria Civil");
        break;
        case "80":
        System.out.println("Programa Ingenieria Mecatronica");
        break;
        default:
        System.out.println("Error de Carrera");
       return;
        }
        
        switch (cod_completo.substring(2,4)) {
        case "91":
        System.out.println("Modalidad Presencial");
        break;
        case "92":
        System.out.println("Modalidad Semipresencial");
        break;
        case "93":
        System.out.println("Modalidad Virtual");
        break;
        default:
        System.out.println("Error de Modalidad");
        return;
        }
        
         a=Integer.parseInt(cod_completo.substring(4,6));
        if(a==00){
            System.out.println("Año de Ingreso 2000");
        }else if(a>00 && a<=99){
            System.out.println("Año de Ingreso 20"+a);
        }else {
            System.out.println("Año de Ingreso Invalido");
        }
        switch (cod_completo.substring(6,8)) {
        case "01":
        System.out.println("Semestre 01");
        break;
        case "02":
        System.out.println("Semestre 02");
        break;
        default:
        System.out.println("Error de Semestre");
        return;
    }
               
       switch (cod_completo.substring(8,10)) {
 
        case "31":
        System.out.println("Ingreso Regular");
        break;
 
        case "32":
        System.out.println("Ingreso por Transferencia");
        break;
           case "33":
        System.out.println("Ingreso por Convenio");
        break;
        default:
        System.out.println("Eror no existe el tipo de ingreso");
        break;
        }
                                  
        p=Integer.parseInt(cod_completo.substring(10,12));
        if(p==0){
            System.out.println("Su puesto en el examen fue: 100");
        }else if(p>0 && p<=99){
             System.out.println("Su puesto en el xamen fue: "+ p);
        }else{
            System.out.println("Error de puesto en el examen ");
        }       
}
}