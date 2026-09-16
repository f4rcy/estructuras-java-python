package Eficiencia;
/*
 * EJERCICIO 8. Comparación general de operaciones
 * Excelente para cerrar la clase: ejecuta TODO junto con los mismos valores de n.
 */
public class Ejercicio08_ComparacionBigO {
    public static void main(String[] args) {
        int[] valoresN = {10, 100, 1000};

        for (int n : valoresN) {
            System.out.println("Analizando con n = " + n);

            int opConstante = 1; // O(1)

            int opLineal = 0; // O(n)
            for (int i = 0; i < n; i++) { opLineal++; }

            int opCuadratica = 0; // O(n^2)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) { opCuadratica++; }
            }

            int opLogaritmica = 0; // O(log n)
            for (int i = n; i > 1; i = i / 2) { opLogaritmica++; }

            int opNLogN = 0; // O(n log n)
            for (int i = 0; i < n; i++) {
                for (int j = n; j > 1; j = j / 2) { opNLogN++; }
            }

            System.out.println("O(1)       -> " + opConstante);
            System.out.println("O(n)       -> " + opLineal);
            System.out.println("O(n^2)     -> " + opCuadratica);
            System.out.println("O(log n)   -> " + opLogaritmica);
            System.out.println("O(n log n) -> " + opNLogN);
        }
    }
}