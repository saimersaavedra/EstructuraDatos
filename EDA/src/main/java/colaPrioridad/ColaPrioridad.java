package colaPrioridad;

import java.util.PriorityQueue;

public class ColaPrioridad<E extends Comparable<E>> {
    private PriorityQueue<E> cola;

    public ColaPrioridad() {
        cola = new PriorityQueue<>();
    }

    public void agregarElemento(E elemento) {
        cola.offer(elemento);
    }

    public E obtenerElemento() {
        return cola.poll();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public int tamaño() {
        return cola.size();
    }
}