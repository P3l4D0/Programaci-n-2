import java.util.Scanner;

public class RaicesEcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula las raíces de la ecuación de segundo grado de coeficientes reales.");
        System.out.println("Ingrese el valor del coeficiente a:");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor del coeficiente b:");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor del coeficiente c:");
        double c = sc.nextDouble();
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces de la ecuación son " + raiz1 + " y " + raiz2 + ".");
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una raíz doble, cuyo valor es " + raiz + ".");
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}