import java.util.Scanner;

public class PorcentajeHombresMujeres {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int hombres, mujeres, totalEstudiantes;
        double porcentajeHombres, porcentajeMujeres;
        
        // Pedir al usuario la cantidad de hombres y mujeres en el aula
        System.out.print("Ingrese la cantidad de hombres en el aula: ");
        hombres = entrada.nextInt();
        System.out.print("Ingrese la cantidad de mujeres en el aula: ");
        mujeres = entrada.nextInt();
        
        // Calcular el total de estudiantes y los porcentajes de hombres y mujeres
        totalEstudiantes = hombres + mujeres;
        porcentajeHombres = ((double)hombres / totalEstudiantes) * 100;
        porcentajeMujeres = ((double)mujeres / totalEstudiantes) * 100;
        
        // Mostrar en pantalla los porcentajes de hombres y mujeres
        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        
        entrada.close();
    }

}
