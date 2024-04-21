
import java.util.Scanner;



/**
 *
 * @author germa
 * 
 * EL USUARIO INGRESA 5 NUMEROS ENTEROS  A UN VECTOR, MOSTRARLOS POR PANTALLA Y SUMARLOS
 
public class Arrays {
    
    public static void main (String[] args){
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese un numero ");
        
        
        int [] numeros = new int [5];
        int i;
        
        for(i = 0; i < 5; i++){
            
            if ()
            
        }
    }
    
    
    
}
*/

import java.util.Scanner;

public class GuardarNumerosEnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Los números ingresados son: ");
        for (int numero : numeros) {
            
            
            
            System.out.println(numero);
        }
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}