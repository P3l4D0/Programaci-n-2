import java.util.Scanner;
import java.util.Arrays;

public class NombresOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[10];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce el nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }
        Arrays.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}