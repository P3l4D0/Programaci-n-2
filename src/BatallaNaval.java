import java.util.Scanner;

public class BatallaNaval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[5][5];
        int fila, columna;
        boolean acierto = false;

        System.out.println("Bienvenido a Batalla Naval");
        System.out.println("Introduzca las coordenadas para adivinar la ubicación del barco (filas: 0-4, columnas: 0-4)");

        // Inicializar el tablero con agua
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = '~';
            }
        }

        // Colocar el barco en una posición aleatoria en el tablero
        int barcoFila = (int) (Math.random() * 3);
        int barcoColumna = (int) (Math.random() * 3);
        tablero[barcoFila][barcoColumna] = 'B';
        tablero[barcoFila][barcoColumna + 1] = 'B';
        tablero[barcoFila][barcoColumna + 2] = 'B';

        // Juego principal
        do {
            // Mostrar el tablero
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            // Pedir al usuario las coordenadas
            System.out.print("Fila: ");
            fila = sc.nextInt();
            System.out.print("Columna: ");
            columna = sc.nextInt();

            // Comprobar si el usuario ha acertado
            if (tablero[fila][columna] == 'B') {
                System.out.println("¡Acertaste! ¡Hundiste el barco!");
                tablero[fila][columna] = 'X';
                acierto = true;
            } else {
                System.out.println("¡Agua! Sigue intentando.");
                tablero[fila][columna] = 'O';
            }
        } while (!acierto);

        // Mostrar el tablero final
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("¡Fin del juego!");
        sc.close();
    }
}

