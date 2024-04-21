import java.time.LocalDate;
import java.time.Period;

public class CalculadoraEdad {
    public static int calcularEdad(LocalDate fechaDeNacimiento, LocalDate fechaActual) {
        return Period.between(fechaDeNacimiento, fechaActual).getYears();
    }

    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1994, 10, 5); // Ejemplo: fecha de nacimiento
        LocalDate fechaActual = LocalDate.now(); // Fecha actual

        int edad = calcularEdad(fechaNacimiento, fechaActual);
        System.out.println("La edad es: " + edad + " años");
    }
}
