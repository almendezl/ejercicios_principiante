
package telefono;
import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class Telefono {

    public static void main(String[] args) {
        String numero;
        double costo;
        double duracion;
        double dolar;
        double pesos;
        numero=JOptionPane.showInputDialog("Ingrese el numero telefonico"); 
        if(numero.length()==10){
        duracion=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la duracion de la llamada en minutos: "));
        dolar=0.00034;

        switch(numero.substring(0,2)){
        case "01": case "02":case "03":case "04":case "05":case "06":case "07":case "08":case "09":case "10":
        costo=0.30;
        pesos=costo*duracion;
            System.out.printf("El numero marcado es: "+numero+"\nEl indicativo es: "+numero.substring(0,2)+
            "\nEl valor del dolar de hoy es: 0.00034 USD"+"\nLa duracion de la llamada es: "+duracion+"\nLa zona es: Norteamerica"+"\nEl valor del minuto es de: "+
                costo+"\nEl valor de la llamada en dolares es de: " +costo*duracion +" USD"+"\nEn pesos es de: %.3f \n", (pesos/dolar));
            break;
            
        case "11": case "12":case "13":case "14":case "15":case "16":case "17":case "18":case "19":case "20":case "21":case "22":case "23":case "24":case "25":
        costo=0.60;
        pesos=costo*duracion;
            System.out.printf("El numero marcado es: "+numero+"\nEl indicativo es: "+numero.substring(0,2)+
            "\nEl valor del dolar de hoy es: 0.00034 USD"+"\nLa duracion de la llamada es: "+duracion+"\nLa zona es: Centroamerica"+"\nEl valor del minuto es de: "+
                costo+"\nEl valor de la llamada en dolares es de: " +costo*duracion+" USD"+"\nEn pesos es de: %.3f \n", (pesos/dolar));
        break;
        
        case "26":case "27": case "28":case "29":case "30":case "31":case "32":case "33":case "34":case "35":case "36":case "37":case "38":case "39":case "40":
        costo=0.50;
        pesos=costo*duracion;
            System.out.printf("El numero marcado es: "+numero+"\nEl indicativo es: "+numero.substring(0,2)+
            "\nEl valor del dolar de hoy es: 0.00034 USD"+"\nLa duracion de la llamada es: "+duracion+"\nLa zona es: Suramerica"+"\nEl valor del minuto es de: "+
                costo+"\nEl valor de la llamada en dolares es de: " +costo*duracion+" USD"+"\nEn pesos es de: %.3f \n", (pesos/dolar));
        break;
        
        case "41":case "42": case "43":case "44":case "45":case "46":case "47":case "48":case "49":case "50":case "51":case "52":case "53":case "54":case "55":case "56":case "57":case "58":case "59":case "60":
        costo=0.30;
        pesos=costo*duracion;
            System.out.printf("El numero marcado es: "+numero+"\nEl indicativo es: "+numero.substring(0,2)+
            "\nEl valor del dolar de hoy es: 0.00034 USD"+"\nLa duracion de la llamada es: "+duracion+"\nLa zona es: Europa"+"\nEl valor del minuto es de: "+
                costo+"\nEl valor de la llamada en dolares es de: " +costo*duracion+" USD" +"\nEn pesos es de: %.3f \n", (pesos/dolar));
        break;
        
        case "61": case "62":case "63":case "64":case "65":case "66":case "67":case "68":case "69":case "70":case "71": case "72":case "73":case "74":case "75":case "76":case "77":case "78":case "79":case "80":
        costo=0.40;
        pesos=costo*duracion;
            System.out.printf("El numero marcado es: "+numero+"\nEl indicativo es: "+numero.substring(0,2)+
            "\nEl valor del dolar de hoy es: 0.00034 USD"+"\nLa duracion de la llamada es: "+duracion+"\nLa zona es: Asia"+"\nEl valor del minuto es de: "+
                costo+"\nEl valor de la llamada en dolares es de: " +costo*duracion +" USD"+"\nEn pesos es de: %.3f \n", (pesos/dolar));
        break;
        
        case "81": case "82":case "83":case "84":case "85":case "86":case "87":case "88":case "89":case "90":case "91": case "92":case "93":case "94":case "95":case "96":case "97":case "98":case "99":case "00":
        costo=0.80;
        pesos=costo*duracion;
            System.out.printf("El numero marcado es: "+numero+"\nEl indicativo es: "+numero.substring(0,2)+
            "\nEl valor del dolar de hoy es: 0.00034 USD"+"\nLa duracion de la llamada es: "+duracion+"\nLa zona es: Africa y Oceania"+"\nEl valor del minuto es de: "+
                costo+"\nEl valor de la llamada en dolares es de: " +costo*duracion+" USD"+"\nEn pesos es de: %.3f \n", (pesos/dolar));
        }
        }
        else
            JOptionPane.showMessageDialog(null, "Numero telefonico erroneo");
}
     
        
        
      


    }
    
  




    


                    
        
        
