

import java.util.Scanner;
import java.time.LocalDate;

public class FechaNacimiento1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate[] fechas = new LocalDate[3];
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingresa la fecha de nacimiento " + (i + 1) + " (dd/mm): ");
            String[] fecha = scanner.nextLine().split("/");
            int dia = Integer.parseInt(fecha[0]);
            int mes = Integer.parseInt(fecha[1]);
            fechas[i] = LocalDate.of(2024, mes, dia);
        }
        for (LocalDate fecha : fechas) {
            LocalDate inicioAnio = LocalDate.of(fecha.getYear(), 1, 1);
            long diasTranscurridos = fecha.toEpochDay() - inicioAnio.toEpochDay();
            System.out.println("Desde el primero de enero han transcurrido " + diasTranscurridos + " días hasta " + fecha);
        }
        ordenarFechas(fechas);
        System.out.println("Fechas ordenadas en forma descendente: ");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha);
        }
    }

    public static void ordenarFechas(LocalDate[] fechas) {
        for (int i = 0; i < fechas.length - 1; i++) {
            for (int j = i + 1; j < fechas.length; j++) {
                if (fechas[i].isBefore(fechas[j])) {
                    LocalDate temp = fechas[i];
                    fechas[i] = fechas[j];
                    fechas[j] = temp;
                }
            }
        }
    }
}