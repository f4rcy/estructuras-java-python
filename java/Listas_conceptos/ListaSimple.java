package Listas_conceptos;

public class Nodo {
    int dato;
    Nodo siguiente;
    public Nodo(int dato) { this.dato = dato; this.siguiente = null; }
}

public class ListaSimple {

    Nodo cabeza;

    /*Insertar al inicio es O(1).*/
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {   // <-- recorre TODA la lista
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void recorrer() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) return true;
            actual = actual.siguiente;
        }
        return false;
    }
}