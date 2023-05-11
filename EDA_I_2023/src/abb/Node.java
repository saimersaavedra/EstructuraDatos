package abb;

public class Node<E> {
    private Node arbIzq;
    private Node arbDer;
    private E dato;

    /**
     * @return the arbIzq
     */
    public Node getArbIzq() {
        return arbIzq;
    }

    /**
     * @param arbIzq the arbIzq to set
     */
    public void setArbIzq(Node arbIzq) {
        this.arbIzq = arbIzq;
    }

    /**
     * @return the arbDer
     */
    public Node getArbDer() {
        return arbDer;
    }

    /**
     * @param arbDer the arbDer to set
     */
    public void setArbDer(Node arbDer) {
        this.arbDer = arbDer;
    }

    /**
     * @return the dato
     */
    public E getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(E dato) {
        this.dato = dato;
    }
    
    
    
}
