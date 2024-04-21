import java.util.Scanner;

public class ArregloNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        int maxPos = 0;
        int minPos = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[maxPos]) {
                maxPos = i;
            }
            if (numeros[i] < numeros[minPos]) {
                minPos = i;
            }
        }
        System.out.println("El número mayor está en la posición " + (maxPos + 1));
        System.out.println("El número menor está en la posición " + (minPos + 1));
    }
}