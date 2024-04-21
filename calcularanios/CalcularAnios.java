/**Defina la clase Empleado, esta clase debe almacenar la siguiente información:
 * dni, nombre, apellido, domicilio, fecha nacimiento y sueldo bruto.
 * Todos estos datos son de tipo String excepto el sueldo bruto que es double. 
 * Todos los atributos son de acceso privado. 

Defina el método constructor de la clase 

Instancie 3 objetos 

Realice método calcular_edad() 

Realice método mostrar_datos()

Realice el diagrama de clases de la clase empleado 

Subir código y diagrama en un archivo word.**/

package calcularanios;


public class CalcularAnios {

 
    public static void main(String[] args) {
        
        Empleados empleado1 = new Empleados ("23213212", "Ernesto", "Sabato", "Casique Guayma","05/10/1994", 300000.00);
        Empleados empleado2 = new Empleados ("23213212", "Emilio", "Sabato", "Casique Guayma","31/12/1997", 300000.00);
        Empleados empleado3 = new Empleados ("23213212", "Eraldo", "Sabato", "Casique Guayma","02/10/2004", 300000.00);
        empleado1.mostrar_datos();
        empleado2.mostrar_datos();
        empleado3.mostrar_datos();
    }
    
}
