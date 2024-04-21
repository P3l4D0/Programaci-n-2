public class SumaYProductoNumerosPares {
    public static void main(String[] args) {
        int suma = 0;
        int producto = 1;
        
        for (int i = 20; i <= 100; i += 2) {
            suma += i;
            producto *= i;
        }
        
        System.out.println("La suma de los números pares entre 20 y 100 es: " + suma);
        System.out.println("El producto de los números pares entre 20 y 100 es: " + producto);
    }
}
