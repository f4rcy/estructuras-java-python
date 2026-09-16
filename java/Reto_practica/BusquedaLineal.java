package Reto_practica;

public class BusquedaLineal {
    public static int buscar(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i;   // ¡se detiene apenas lo encuentra!
            }
        }
        return -1;
    }
}