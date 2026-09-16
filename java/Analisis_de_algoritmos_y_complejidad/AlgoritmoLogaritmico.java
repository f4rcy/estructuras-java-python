package Analisis_de_algoritmos_y_complejidad;

public class AlgoritmoLogaritmico {
    public static void main(String[] args) {
        int n = 100;
        int contador = 0;
        int i = 1;

        while (i < n) {
            i = i * 2;   // <-- se DUPLICA en cada vuelta
            contador++;
        }

        System.out.println("Total de ejecuciones: " + contador);
    }
}