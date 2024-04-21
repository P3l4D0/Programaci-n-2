
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** consigna 2
 * el usuario ingresa 5 nombres de personas. (String)
 * el programa muetra los 5 nombres en mayusculas 
 * los nombres los guardamos en un vector 
 *
 * @author germa
 el usuario ingresa 10 numeros, muestra cuantos positivos y cuantos negativos hay
 */
public class practicaClase {
    
    public static void main (String[] args){
        
        Scanner teclado = new Scanner (System.in);
        int negativos = 0;
        int positivos = 0;
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número: "+(i+1));
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < 10; i++) {
            
            if  (numeros[i] < 0){
                negativos =  negativos +1;
            }
            else{
                positivos = positivos+1;
                
            }
            
            
            
        }
        System.out.println("La cantidad de numeros positivos son: "+positivos);
            System.out.println("La cantidad de numeros negativos son: "+negativos);
        
        
    }
    
}
