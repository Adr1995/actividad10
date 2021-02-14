
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Dpl_Adrian.
 *
 * @author adri_
 */

public class Dpl_Adrian {

    /**
     * The main method.
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        /**
         * Pide dos números al usuario para posteriormente hacer una multiplicación y mostrar el resultado

         * @param n1 aquí guardará el primer número introducido por el usuario
         * @param n2 aquí guardará el segundo número introducido por el usuario
         * @param resultado guardará el resultado de la multiplicación
         */
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un número");
    int n1 = sc.nextInt();
    System.out.println("Introduzca otro número");
    int n2 = sc.nextInt();
    int resultado = n1*n2;
    System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
