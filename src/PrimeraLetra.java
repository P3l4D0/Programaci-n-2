import java.util.Scanner;

public class PrimeraLetra {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un nombre: ");
        
        String nombre = scanner.nextLine();
        
        char primeraLetra = nombre.charAt(0);
        
        System.out.println("La primera letra del nombre es: " + primeraLetra);
    }
}