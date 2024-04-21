import java.util.Scanner;

public class NumeroSuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario su fecha de nacimiento
        System.out.print("Ingrese su fecha de nacimiento (dd/mm/yyyy): ");
        String fecha = sc.nextLine();
        
        // Obtener el día, mes y año de la fecha de nacimiento
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int anio = Integer.parseInt(fecha.substring(6, 10));
        
        // Calcular el número de la suerte
        int numSuerte = dia + mes + anio;
        while (numSuerte >= 10) {
            int suma = 0;
            while (numSuerte > 0) {
                suma += numSuerte % 10;
                numSuerte /= 10;
            }
            numSuerte = suma;
        }
        
        // Mostrar el número de la suerte al usuario
        System.out.println("Su número de la suerte es: " + numSuerte);
    }
}







