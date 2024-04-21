import java.util.Arrays;

public class OrdenarVector {
    public static void main(String[] args) {
        double[] numeros = {5.2, 3.1, 2.0, 4.6, 1.5};
        System.out.println("Vector original: " + Arrays.toString(numeros));
        ordenarParesImpares(numeros);
        System.out.println("Vector ordenado: " + Arrays.toString(numeros));
    }

    public static void ordenarParesImpares(double[] numeros) {
        int i = 0;
        int j = numeros.length - 1;
        while (i < j) {
            while (i < j && numeros[i] % 2 == 0) {
                i++;
            }
            while (i < j && numeros[j] % 2 != 0) {
                j--;
            }
            if (i < j) {
                double temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }
    }
}