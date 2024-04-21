

package calcularanios;


public class Empleados {
    private String dni, nombre, apellido, direccion, fechaDeNacimiento;
    private double sueldoBruto;

    public Empleados(String dni, String nombre, String apellido, String direccion, String fechaDeNacimiento, double sueldoBruto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sueldoBruto = sueldoBruto;
    }
    
    public int calcular_edad(){
        String[] formatoFecha = fechaDeNacimiento.split("/");
        int anioNacimiento = Integer.parseInt(formatoFecha[2]);
        int anioActual = java.time.LocalDate.now().getYear();
        return anioActual - anioNacimiento;
    }
    
    public void mostrar_datos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("DNI: "+ dni);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Sueldo: "+ sueldoBruto);
        System.out.println("Fecha De Nacimiento: "+ fechaDeNacimiento);
        System.out.println("Edad: "+ calcular_edad()+" anios");
        System.out.println("-----------------------");
    }
}
