

import java.util.Scanner;

public class BinarioADecimal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce número binario: ");
        String binario = teclado.nextLine();

        int[] bits = new int[binario.length()];
        for (int i = 0; i < bits.length; i++) {
            bits[i] = Character.getNumericValue(binario.charAt(i));
        }

        int exponente = 0;
        int valorDecimal = 0;

        for (int i = bits.length - 1; i >= 0; i--) {
            if (bits[i] == 1) {
                valorDecimal += Math.pow(2, exponente);
            }

            exponente++;
        }

        System.out.println("\nValor decimal: " + valorDecimal);

    }

}
