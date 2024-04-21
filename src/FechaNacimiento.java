import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;

public class FechaNacimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate[] fechas = new LocalDate[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa la fecha de nacimiento " + (i + 1) + " (dd/mm): ");
            String[] fecha = scanner.nextLine().split("/");
            int dia = Integer.parseInt(fecha[0]);
            int mes = Integer.parseInt(fecha[1]);
            fechas[i] = LocalDate.of(2023, mes, dia);
        }
        for (LocalDate fecha : fechas) {
            LocalDate inicioAnio = LocalDate.of(fecha.getYear(), 1, 1);
            long diasTranscurridos = ChronoUnit.DAYS.between(inicioAnio, fecha);
            System.out.println("Desde el primero de enero han transcurrido " + diasTranscurridos + " días hasta " + fecha);
        }
        Arrays.sort(fechas, Collections.reverseOrder());
        System.out.println("Fechas ordenadas en forma descendente: ");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha);
        }
    }
}