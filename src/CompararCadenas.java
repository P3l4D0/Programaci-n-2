

import java.util.Scanner;

public class CompararCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la primera cadena: ");
        
        String cadena1 = scanner.nextLine();
        
        System.out.print("Introduce la segunda cadena: ");
        
        String cadena2 = scanner.nextLine();
        
        if (cadena1.equals(cadena2)) {
            
            System.out.println("Las cadenas son iguales.");
            
        } else {
            
            System.out.println("Las cadenas son diferentes.");
        }
    }
}