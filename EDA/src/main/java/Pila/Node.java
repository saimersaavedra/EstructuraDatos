/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author MajoLvR
 */
public class Node<A> {
    private A dato;
    private Node siguiente;

    public Node(A dato, Node siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    /**
     * @return the dato
     */
    public A getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(A dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Node getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
}
