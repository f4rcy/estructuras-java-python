package Reto_practica;

public class BusquedaBinaria {
    public static int buscar(int[] arreglo, int objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == objetivo) {
                return medio;
            } else if (arreglo[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // no encontrado
    }
}