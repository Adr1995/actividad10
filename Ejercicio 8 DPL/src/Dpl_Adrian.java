
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
         * Pide dos n�meros al usuario para posteriormente hacer una multiplicaci�n y mostrar el resultado

         * @param n1 aqu� guardar� el primer n�mero introducido por el usuario
         * @param n2 aqu� guardar� el segundo n�mero introducido por el usuario
         * @param resultado guardar� el resultado de la multiplicaci�n
         */
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un n�mero");
    int n1 = sc.nextInt();
    System.out.println("Introduzca otro n�mero");
    int n2 = sc.nextInt();
    int resultado = n1*n2;
    System.out.println("El resultado de la multiplicaci�n es: " + resultado);
    }
}
