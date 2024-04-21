import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Ingrese el número para la tabla de multiplicar: ");
        num = teclado.nextInt();

        System.out.println("Tabla de multiplicar del " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        teclado.close();
    }
}
