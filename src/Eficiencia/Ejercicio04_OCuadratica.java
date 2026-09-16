package Eficiencia;
import java.util.Scanner;
/*
 * EJERCICIO 4. Complejidad cuadrática — O(n²)
 * Un ciclo dentro de otro ciclo.
 */
public class Ejercicio04_OCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                contador++;
            }
        }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Complejidad: O(n^2)");
    }
}