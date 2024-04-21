import java.util.Scanner;

public class ContadorPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, positivos = 0, negativos = 0;
        
        do {
            System.out.print("Ingresa un número (0 para salir): ");
            num = scanner.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }

        } while (num != 0);

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        scanner.close();
    }
}
