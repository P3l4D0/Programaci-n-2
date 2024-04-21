
import java.util.Scanner;


public class intercalarNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[5];
        b = new int[5];
        c = new int[10];

        System.out.println("ingresar el primer arreglo: ");

        for (int i = 0; i < 10; i++) {

            System.out.println("ingrese el segundo arreglo: ");

            a[i] = teclado.nextInt();

        }
        
        for (int i = 0; i <10; i++){
            
            System.out.println("ingrese el segundo arreglo: ");
            
           a[i] = teclado.nextInt();
        }
        
        int j = 0;
        for (int i = 0; i<10; i++){
            c[j]= a[i];
            j++;
            c[j]= b[i];
            j++;
        }
        System.out.println("el arreglo mezclado es "+j+1+" "+c[j] );

    }

}
