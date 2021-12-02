package primaryarithmetic;
import java.util.Scanner;
/**
 *
 * @author Angie Mendez
 */
public class PrimaryArithmetic {
public static void initializeArray(int digitsA[], int digitsB[]){
    for(int i=0;i<3;i++){
    digitsA[i]=0;
    digitsB[i]=0;
    }
}
public static int convert (String input){
    int num;
    return num=Integer.parseInt(input);
}
public static void digits(int digitsA[], int digitsB[], String input){
    if(input.length()== 7){
    digitsA[0]=(convert(input.substring(0,1)));
    digitsA[1]=(convert(input.substring(1,2)));
    digitsA[2]=(convert(input.substring(2,3)));
    
    digitsB[0]=(convert(input.substring(4,5)));
    digitsB[1]=(convert(input.substring(5,6)));
    digitsB[2]=(convert(input.substring(6,7)));
    }else{
        System.exit(0);
    }
}
public static int add(int digitsA[], int digitsB[]){
    int accountant=0;
    for(int i=0;i<3;i++){
        if((digitsA[i]+digitsB[i])>=10){
            accountant++;
        }
    }  
return accountant;
}
public static void check(int accountant){
    switch(accountant){
        case 0:System.out.print("No carry operation.");break;
        case 1:System.out.print(accountant + " carry operation.");break;
        case 2: case 3:System.out.print(accountant + " carry operations.");break;
    }
}
    public static void main(String[] args) {
        String input;
        int digitsA [] = new int [3];
        int digitsB [] = new int [3];
        do{
        System.out.println();
        Scanner data = new Scanner (System.in);
        input=data.nextLine();
        initializeArray(digitsA, digitsB);
        digits(digitsA, digitsB,input);
        check(add(digitsA, digitsB));
        }while(input.length()==7); 
    }  
}