
import java.util.Scanner;

public class Alumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[10];
        int[] edades = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingresa la edad: ");
            edades[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[i].compareTo(nombres[j]) > 0) {
                    String auxNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxNombre;
                    int auxEdad = edades[i];
                    edades[i] = edades[j];
                    edades[j] = auxEdad;
                }
            }
        }

        System.out.println("Nombres y edades en orden alfabético:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + edades[i]);
        }

        System.out.println("Alumnos mayores de 18 años:");
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] > 18) {
                System.out.println(nombres[i] + ": " + edades[i]);
            }
        }

        System.out.println("Nombres que comienzan con vocal:");
        String vocales = "AEIOU";
        for (int i = 0; i < nombres.length; i++) {
            if (vocales.contains(String.valueOf(nombres[i].charAt(0)).toUpperCase())) {
                System.out.println(nombres[i] + ": " + edades[i]);
            }
        }
    }
}