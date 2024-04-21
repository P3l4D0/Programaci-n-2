import java.util.Scanner;

public class EliminarEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        
        String input = scanner.nextLine();
        
        String output = input.replaceAll("\\s", "");
        
        System.out.println("Sin espacios: " + output);
    }
}