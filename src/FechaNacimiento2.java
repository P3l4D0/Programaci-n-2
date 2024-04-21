import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class FechaNacimiento2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate[] fechas = new LocalDate[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la fecha " + (i + 1) + " (ddmmaaaa): ");
            String fecha = scanner.nextLine();
            int dia = Integer.parseInt(fecha.substring(0, 2));
            int mes = Integer.parseInt(fecha.substring(2, 4));
            int anio = Integer.parseInt(fecha.substring(4));
            fechas[i] = LocalDate.of(anio, mes, dia);
        }
        Arrays.sort(fechas);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        System.out.println("Fechas ordenadas en forma ascendente: ");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha.format(formatter));
        }
    }
}