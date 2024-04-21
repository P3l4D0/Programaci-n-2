
/*import java.util.Scanner;

public class ParImpar {

   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }

        if ( numeros % 2 == 0 ) {
            
            System.out.println("el numero "+numeros+" es par");
        }
    }
}*/

import java.util.Random;

public class ParImpar {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if (numeros[i] % 2 == 0) {
                System.out.println("es par");
            } else {
                System.out.println("es impar");
            }
        }
    }
}
