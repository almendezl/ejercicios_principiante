package cuadradoasterisco;

/**
 *
 * @author Angie Mendez
 */
public class CuadradoAsterisco {

    public static void main(String[] args) {
    System.out.println("Cuadrado de asteriscos: ");
    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++)
            System.out.print(" *");
        System.out.println();
    }
    System.out.println("Triangulo de asteriscos: ");
    for(int i=0;i<10;i++){
        for(int j=0;j<i;j++)
            System.out.print(" * ");
        System.out.println();
    }
        
    }
    
}
