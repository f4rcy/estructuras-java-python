package Eficiencia;
/*
 * EJERCICIO 1. Complejidad constante — O(1)
 * No importa el valor de n. Siempre se ejecuta la misma cantidad de instrucciones.
 */
public class Ejercicio01_OConstante {
    public static void main(String[] args) {
        int n = 1000; // realmente no afecta la cantidad de operaciones
        int contador = 0;

        contador++; // operación 1
        int x = 5;
        contador++; // operación 2
        int y = 10;
        contador++; // operación 3
        int suma = x + y;
        contador++; // operación 4

        System.out.println("Operaciones contadas: " + contador);
        System.out.println("Complejidad: O(1)");
    }
}