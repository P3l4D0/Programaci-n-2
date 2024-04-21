import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaNacimiento3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate[] fechas = new LocalDate[5];
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingresa el día " + (i + 1) + ": ");
            int dia = scanner.nextInt();
            System.out.println("Ingresa el mes " + (i + 1) + ": ");
            int mes = scanner.nextInt();
            fechas[i] = LocalDate.of(2023, mes, dia);
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha.format(formatter));
        }
    }
}