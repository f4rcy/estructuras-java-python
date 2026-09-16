package Eficiencia;
import java.util.Scanner;
/*
 * EJERCICIO 7. Complejidad n log n — O(n log n)
 * Un ciclo externo que corre n veces, y dentro otro que divide entre 2.
 */
public class Ejercicio07_ONLogN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > 1; j = j / 2) {
                contador++;
            }
        }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Complejidad: O(n log n)");
    }
}