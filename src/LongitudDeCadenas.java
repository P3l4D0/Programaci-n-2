import java.util.Scanner;
public class LongitudDeCadenas {
    
    

//public class LongitudCadena {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena de caracteres: ");
        
        String cadena = scanner.nextLine();
        
        int longitud = cadena.length();
        
        System.out.println("La longitud de la cadena es: " + longitud);
    }
}
    

