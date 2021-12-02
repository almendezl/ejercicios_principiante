package sopadenumeros;

import javax.swing.JOptionPane;
/**
 *
 * @author Angie Mendez
 */
public class SopadeNumeros {
    public static int generar(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
   public static void llenar(int a[][]){
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = generar(0,9);
            }
        }
    }
public static void initializeArray(int digits[]){
    for(int i=0;i<3;i++){
    digits[i]=0;
    }
}
public static void mostrarMatriz(int m[][]){
    for (int[] m1 : m) {
        for (int j = 0; j < m1.length; j++) {
            System.out.print(m1[j] + "\t");
        }
        System.out.println("");
    }       
}
public static int convert (String input){
    int num;
    num=Integer.parseInt(input);
    return num;
}
public static void digits(int digits[], String numero){
    digits[0]=(convert(numero.substring(0,1)));
    digits[1]=(convert(numero.substring(1,2)));
    digits[2]=(convert(numero.substring(2,3)));
}
public static void posXFilas(int m [][], int digitos[]){
for(int i=0; i<m.length;i++){
        for(int j=0; j<m[i].length-2;j++){
            if(m[i][j] == digitos[0]){
                if(m[i][j+1] == digitos[1]){
                    if(m[i][j+2] == digitos[2]){
                        System.out.println("Encontrado!!!");
                        System.out.println("Las posiciones son:\nPara "+digitos[0]+": Fila "+(i+1)+" Columna "+(j+1)+" "+
                                "\nPara "+digitos[1]+": Fila "+(i+1)+" Columna "+(j+2)+" "+"\nPara "+digitos[2]+": Fila "+(i+1)
                                +" Columna "+(j+3));
                    }    
                }  
            }        
}              
}
}
public static void posXFilasInv(int m [][], int digitos[]){
for(int i=0; i<m.length;i++){
        for(int j=0; j<m[i].length-2;j++){
            if(m[i][j] == digitos[2]){
                if(m[i][j+1] == digitos[1]){
                    if(m[i][j+2] == digitos[0]){
                        System.out.println("Encontrado!!!");
                        System.out.println("Las posiciones son:\nPara "+digitos[0]+": Fila "+(i+1)+" Columna "+(j+3)+" "+
                                "\nPara "+digitos[1]+": Fila "+(i+1)+" Columna "+(j+2)+" "+"\nPara "+digitos[2]+": Fila "+(i+1)
                                +" Columna "+(j+1));
                    }    
                }
            }        
        }              
}
}
public static void posXColum(int m[][], int digitos[]){
for(int j=9;j>=0;j--){
    for(int i=9;i>=2;i--){
        if(m[i][j] == digitos[2]){
            if(m[i-1][j] == digitos[1]){
                if(m[i-2][j] == digitos[0]){
                    System.out.println("Encontrado!!!");
                    System.out.println("Las posiciones son:\nPara "+digitos[0]+": Fila "+(i-1)+" Columna "+(j+1)+" "+
                                "\nPara "+digitos[1]+": Fila "+(i)+" Columna "+(j+1)+" "+"\nPara "+digitos[2]+": Fila "+(i+1)
                                +" Columna "+(j+1));
                }
            }  
        }
    }
}
    
}
public static void posXColumInv(int m[][], int digitos[]){
for(int j=9;j>=0;j--){
    for(int i=9;i>=2;i--){
        if(m[i][j] == digitos[0]){
            if(m[i-1][j] == digitos[1]){
                if(m[i-2][j] == digitos[2]){
                    System.out.println("Encontrado!!!");
                    System.out.println("Las posiciones son:\nPara "+digitos[0]+": Fila "+(i+1)+" Columna "+(j+1)+" "+
                                "\nPara "+digitos[1]+": Fila "+(i)+" Columna "+(j+1)+" "+"\nPara "+digitos[2]+": Fila "+(i-1)
                                +" Columna "+(j+1));
                }
            }
        }
    }
} 
}
    public static void main(String[] args) {
    String numero;
    int digitos[] = new int [3];
    int matriz [][] =new int[10][10];
    llenar(matriz);
    initializeArray(digitos);
        System.out.println("SOPA DE NUMEROS\n ");
    mostrarMatriz(matriz);
    numero=JOptionPane.showInputDialog("Ingrese el numero de tres cifras a buscar:");
    if(numero.length() == 3){
    digits(digitos, numero);
    posXFilas(matriz, digitos);
        System.out.println("");
    posXFilasInv(matriz, digitos);
        System.out.println("");
    posXColumInv(matriz,digitos);
        System.out.println("");
    posXColum(matriz,digitos);
    }
    else{
        System.out.println("Error, debe ser un numero de tres cifras");
    } 
        }
    }