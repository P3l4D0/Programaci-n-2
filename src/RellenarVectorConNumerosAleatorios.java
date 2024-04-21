
/** consigna 3 
 * Se carga un vector de 100 posiciones con numeros aleatorios
 * el programa muestra que numeros hay en una posicion determinada
 * ingrese la posicion que desea saber el numero y el programa muestra el numero que hay en esa posicion  
 /* consigna 4
 * cargar un vector 10 numeros enteros 
 * el programa muestra los numeros ingresados de menor a mayor, es decir de forma creciente 
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class RellenarVectorConNumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = random.nextInt(100);
        }

        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un numero del 1 al 100: ");

        int posicion = teclado.nextInt();

        if (posicion >= 1 && posicion <= 100) {
            System.out.println("El numero aleatorio en la posicion " + posicion + " es " + vector[posicion]);
        } else {
            System.out.println("La posicion elegida no existe malandro");
        }

    }
}
