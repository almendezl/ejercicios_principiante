package cuadradomagico;

import javax.swing.JOptionPane;

public class Cuadradomagico {
    
public static void llenarCuadrado(int m[][]){
for(int i=0; i<m.length;i++){
        for(int j=0; j<m[i].length;j++)
            m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato en la posicion ["+(i+1)+"]"+"["+(j+1)+"]"));
}
}
public static void  imprimirXfilas (int m[][]){
    for(int i=0; i<m.length;i++){
        for(int j=0; j<m[i].length;j++)
            System.out.print(m[i][j]+"\t");
        System.out.println();
}       
}
public static void sumaXfilas( int cuadrado[][],int arreglo[]){
	for(int i=0; i<cuadrado.length;i++){
            int sumaXFilas = 0;			
            for(int j=0;j<cuadrado.length; j++){
		sumaXFilas= sumaXFilas+cuadrado[i][j];
		arreglo[i+2]= sumaXFilas;
            }
	}
	System.out.print("\n");		
    }
public static void sumaXcolumnas(int cuadrado[][],int arreglo[]){
	for(int j=0;j<cuadrado.length; j++){
            int sumaXColumnas = 0;
            for(int i=0;i<cuadrado.length; i++){
		sumaXColumnas=sumaXColumnas+cuadrado[i][j];
		arreglo[j+(cuadrado.length+2)]=sumaXColumnas;	
            }
	}
	System.out.print("\n");
    }
public static void diagonalPrincipal(int cuadrado[][], int arreglo[]){
        int diagonalPrin = 0;	
	for(int i=0;i<cuadrado.length; i++){
            for(int j=0;j<cuadrado.length; j++){
		if(i==j){
                    diagonalPrin += cuadrado[i][j];
		}	
            }	
            arreglo[0]=diagonalPrin;
	}
	System.out.println("");
    }
public static void diagonalSecundaria(int cuadrado[][], int arreglo[]){
	int diagonalSec = 0;	
	for(int i=0;i<cuadrado.length; i++){
            for(int j=0;j<cuadrado.length; j++){
		if(i+j==cuadrado.length-1){
                    diagonalSec += cuadrado[i][j];
		}					
            }
            arreglo[1]=diagonalSec;
	}
	System.out.println("");	
    }
    public static void inicializarArreglo(int Aposicione[]){
	for(int i=0;i<Aposicione.length;i++){
            Aposicione[i]=0;
	}
    }
    
   public static void comprobacion(int arreglo[]){
        int comparacion=0;
	int copiaA[]=new int [arreglo.length];
	for(int i=0;i<arreglo.length;i++)
            copiaA[i]=arreglo[0];	
            for(int j=0;j<copiaA.length;j++){
		if(copiaA[j]==arreglo[j]){
		comparacion++;
		}
            }
	if(comparacion==copiaA.length){
            JOptionPane.showMessageDialog(null,"SI,si es un cuadrado magico");	
        }else if(comparacion<copiaA.length){
            JOptionPane.showMessageDialog(null,"NO, no es un cuadrado magico");
        }
    }   
    public static void main(String[] args) {
        int tamaño;
        tamaño= Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el tamaño del cuadrado"));
        if(tamaño>0){
        int cuadrado [][] =new int[tamaño][tamaño];     
        int arregloSumas[]=new int [tamaño*2+2];
        llenarCuadrado(cuadrado);
        imprimirXfilas(cuadrado);  
        sumaXfilas(cuadrado,arregloSumas);
        sumaXcolumnas(cuadrado,arregloSumas);
        diagonalPrincipal(cuadrado,arregloSumas);
        diagonalSecundaria(cuadrado,arregloSumas);
        comprobacion(arregloSumas);}
    else{
            JOptionPane.showMessageDialog(null, "Error en el tamaño del cuadrado");}
        System.exit(0);
    }

    } 
    
    

