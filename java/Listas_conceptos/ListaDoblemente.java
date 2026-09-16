package Listas_doblemente_enlazada;

public class Nodo {
    int dato;
    Nodo siguiente;
    Nodo anterior;
    public Nodo(int dato) { this.dato = dato; this.siguiente = null; this.anterior = null; }
}

public class ListaDoblemente {

    Nodo cabeza;

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza != null) {
            cabeza.anterior = nuevo;
            nuevo.siguiente = cabeza;
        }
        cabeza = nuevo;
    }

    public void recorrer() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
    }

    public void recorrerAtras() {
        Nodo actual = cabeza;
        while (actual.siguiente != null) {   // <-- 1) busca el último (no hay cola)
            actual = actual.siguiente;
        }
        while (actual != null) {             // <-- 2) recorre hacia atrás
            System.out.print(actual.dato + " <- ");
            actual = actual.anterior;
        }
    }
}