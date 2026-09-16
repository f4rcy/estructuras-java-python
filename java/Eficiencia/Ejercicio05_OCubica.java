package Eficiencia;
import java.util.Scanner;
/*
 * EJERCICIO 5. Complejidad cúbica — O(n³)
 * Tres ciclos anidados.
 */
public class Ejercicio05_OCubica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    contador++;
                }
            }
        }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Complejidad: O(n^3)");
    }
}
