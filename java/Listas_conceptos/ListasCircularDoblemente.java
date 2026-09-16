package Listas_circulares_doblemente_encadenadas;

public class Nodo {
    int dato;
    Nodo siguiente;
    Nodo anterior;
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = this;   // se enlaza consigo mismo al crearse
        this.anterior = this;
    }
}

public class ListasCircularDoblemente {

    Nodo cabeza;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.anterior = nuevo;
            cabeza.siguiente = nuevo;
        } else {
            // cabeza.anterior SIEMPRE es el último nodo: acceso directo, O(1)
            Nodo ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }

    public void recorrer() {
        if (cabeza == null) return;
        Nodo actual = cabeza;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}