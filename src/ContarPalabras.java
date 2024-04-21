import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una cadena: ");
        
        String entrada = scanner.nextLine();
        
        String[] palabras = entrada.split("\\s+");
        
        int cantidadDePalabras = palabras.length;
        
        System.out.println("La cantidad de palabras en la cadena es: " + cantidadDePalabras);
        
    }
}