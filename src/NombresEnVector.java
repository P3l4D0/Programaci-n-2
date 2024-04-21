
/** consigna 2
 * el usuario ingresa 5 nombres de personas. (String)
 * el programa muetra los 5 nombres en mayusculas
 * los nombres los guardamos en un vector
 * 
 */
 
import java.util.Scanner;

public class NombresEnVector {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un nombre nro " + (i + 1));
            nombres[i] = teclado.nextLine();

        }
        for (int i = 0; i < 5; i++) {

            nombres[i] = nombres[i].toUpperCase();

            System.out.println("Los nombres en mayuscula son: " + nombres[i]);

        }

    }
}
