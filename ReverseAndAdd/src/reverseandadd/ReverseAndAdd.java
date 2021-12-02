package reverseandadd;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class ReverseAndAdd { 
static Scanner datos = new Scanner(System.in);
static double pedirDato(){
    System.out.print("");
    return datos.nextInt();   
    }
public static int inverse(int number){
    int inverse;
    String comp;
    String inv="";
    comp=Integer.toString(number);
    for(int i=0; i<comp.length();i++){
        inv= comp.charAt(i)+inv;
    }
    return inverse = Integer.parseInt(inv);
}
public static int check(int number){
    int inverse;
    int check;
    String comp;
    String inv="";
    comp=Integer.toString(number);
    for(int i=0; i<comp.length();i++){
        inv= comp.charAt(i)+inv;
    }
    if (comp.equals(inv)){
        return inverse = Integer.parseInt(inv);
    }else{
        return check = 0;
    }
}
public static int add (int num1, int num2){
    int add;
    return add = num1 + num2;
}
public static void main(String[] args) {
    int cases;
    int number;
    int iterations;
    cases = (int)pedirDato();
    for(int i=0; i<cases; i++){
        number = (int)pedirDato();
        iterations=0;
        do{
            number=add(number, (inverse(number)));
            iterations++;
        }while(check(add(number, (inverse(number)))) == 0);
        System.out.println((iterations+1)+" "+add(number, (inverse(number))));    
    }
    }
}