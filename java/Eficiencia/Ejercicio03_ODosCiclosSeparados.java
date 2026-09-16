package Eficiencia;
import java.util.Scanner;
/*
 * EJERCICIO 3. Dos ciclos separados — O(n + n) = O(n)
 * No están anidados, así que no se multiplican: se SUMAN.
 */
public class Ejercicio03_ODosCiclosSeparados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < n; i++) { contador++; }
        for (int j = 0; j < n; j++) { contador++; }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Análisis: O(n + n) = O(2n) = O(n)");
    }
}