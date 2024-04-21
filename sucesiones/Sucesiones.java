/** El usuario ingresa dos elementos de la sucesion, las posiciones que ocupan dichos numeros en la sucesion
 * (tener en cuenta que se pueden ingresar valores que no sean consecutivos.) 
 * Ademas el usuario debe ingresar cuantos términos de la sucesion desea generar n
 * Mostrar por pantalla los datos generados de izquierda a derecha y de derecha a izquierda**/
package sucesiones;

import java.util.Scanner;


public class Sucesiones {
    
 
    public static void main(String[] args) {
        
        Operacion op = new Operacion();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primero numero de la sucesion: ");
        int primerNumero = sc.nextInt();
        op.setPrimerNumero(primerNumero);
        
        System.out.println("Ingrese la diferencia entre terminos de la sucesion: ");
        int diferencia = sc.nextInt();
        op.setDiferencia(diferencia);
        
        System.out.println("Ingrese la cantidad de numeros que tendra la sucesion: ");
        int n = sc.nextInt();
        op.setN(n);
        
        System.out.println("La sucesion de izquierda a derecha es: ");
        Operacion.generarSucesion(primerNumero, diferencia, n);
        
        System.out.println("\nY de derecha a izquierda es: ");
        Operacion.generarSucesionInvertida(primerNumero, diferencia, n );
    }
    

}
