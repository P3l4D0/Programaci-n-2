public class NumerosImpares {
    public static void main(String[] args) {
        for (int i = 1000; i >= 100; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
