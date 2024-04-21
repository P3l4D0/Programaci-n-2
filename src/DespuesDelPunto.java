import java.util.Scanner;

public class DespuesDelPunto {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una cadena: ");
        
        String entrada = scanner.nextLine();
        
        int indice = entrada.indexOf(".");
        
        if (indice != -1) {
            
            System.out.println(entrada.substring(indice + 1));
            
        } else {
            
            System.out.println("La cadena no contiene un punto.");
            
        }
        
    }
}
