import java.util.Scanner;

public class AlturaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de personas: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("El número de personas debe ser un entero positivo.");
            return;
        }
        double[] alturas = new double[n];
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la altura de la persona " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
            suma += alturas[i];
        }
        double media = suma / n;
        int superiores = 0;
        int inferiores = 0;
        for (int i = 0; i < n; i++) {
            if (alturas[i] > media) {
                superiores++;
            } else if (alturas[i] < media) {
                inferiores++;
            }
        }
        System.out.println("Altura media: " + media);
        System.out.println("Personas con altura superior a la media: " + superiores);
        System.out.println("Personas con altura inferior a la media: " + inferiores);
    }
}