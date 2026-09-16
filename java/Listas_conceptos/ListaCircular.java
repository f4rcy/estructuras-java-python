package Listas_conceptos;

public class ListaCircular {

    Nodo cabeza;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != cabeza) {   // <-- recorre para hallar el último
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public void recorrer() {
        if (cabeza == null) return;
        Nodo actual = cabeza;
        // Usamos do-while porque la lista circular no tiene null
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public boolean buscar(int valor) {
        if (cabeza == null) return false;
        Nodo actual = cabeza;
        do {
            if (actual.dato == valor) return true;
            actual = actual.siguiente;
        } while (actual != cabeza);
        return false;
    }
}