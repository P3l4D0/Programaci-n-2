/** El usuario ingresa dos elementos de la sucesion, las posiciones que ocupan dichos numeros en la sucesion
 * (tener en cuenta que se pueden ingresar valores que no sean consecutivos.) 
 * Ademas el usuario debe ingresar cuantos términos de la sucesion desea generar n
 * Mostrar por pantalla los datos generados de izquierda a derecha y de derecha a izquierda**/
package sucesiones;

public class Operacion {
    
  
    private int primerNumero;
    private int diferencia;
    private int n;

    public Operacion() {
    }

    public Operacion(int primerNumero, int diferencia, int n) {
       
        this.primerNumero = primerNumero;
        this.diferencia = diferencia;
        this.n = n;
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
   
    
      public static void generarSucesion (int elemento, int diferencia, int n) {
    
   if (n > 0){
       System.out.print(elemento + " ");
       generarSucesion(elemento + diferencia, diferencia, n - 1);
   }
}
      public static void generarSucesionInvertida (int elemento, int diferencia, int n) {
    
   if (n > 0){
       
       generarSucesionInvertida(elemento + diferencia, diferencia, n - 1);
       System.out.print(elemento + " ");
   }
}
   

}
