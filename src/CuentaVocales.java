
import java.util.Scanner;
public class CuentaVocales {
     
    public static void main (String[] args){
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese una cadena: ");
        String cadena = teclado.nextLine();
        
       
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        System.out.println("Número de vocales: " + contador);
        
        String cadenasMayus = cadena.toUpperCase();
        
        System.out.println("En mayusculas quedaria: " + cadenasMayus);
    }
}
        
        
    
    
    
    

