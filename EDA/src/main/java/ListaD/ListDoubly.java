/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaD;

import EjerciciosAsociacion.Mascota;
import Utilidades.Estructura;

/**
 *
 * @author MajoLvR
 */
public class ListDoubly<A> implements Estructura<A> {

    Node inicio;
    Node fin;

    @Override
    public void add(A dato) {
        Node nuevo = new Node();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;

        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    @Override
    public void addFinal(A dato) {
        Node nuevo = new Node();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;

        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }

    public void imprimir() {
        Node aux = inicio;
        while (aux != null) {
            System.out.println("El dato es : " + aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public boolean esVacia() {
        return inicio == null;
    }

    @Override
    public A buscar(A dato) {
        Node aux = inicio;
        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                return (A) aux.getDato();
            }
            aux = aux.getSiguiente();
        }

        return null;
    }

    @Override
    public A eliminarInicio() {
        if (inicio == null) {
            return null;
        }
        A dato = (A) inicio.getDato();
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {

            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        }
        return dato;

    }

    @Override
    public A eliminarFinal() {
        if (inicio == null) {
            return null;
        }
        A dato = (A) fin.getDato();
        if (inicio == fin) {

            inicio = null;
            fin = null;
        } else {

            fin = fin.getAnterior();
            fin.setSiguiente(null);
        }
        return dato;
    }

    @Override
    public A eliminar(A dato) {
        if (inicio == null) {
            return null;
        }
        if (inicio.getDato().equals(dato)) {
            return eliminarInicio();
        }
        if (fin.getDato().equals(dato)) {
            return eliminarFinal();
        }
        Node aux = inicio.getSiguiente();
        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux.getAnterior());
                return (A) aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean vacia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Node<Mascota> getHead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Node getInicio() {
        return inicio;
    }

    public void setInicio(Node inicio) {
        this.inicio = inicio;
    }

    public Node getFin() {
        return fin;
    }

    public void setFin(Node fin) {
        this.fin = fin;
    }

    public void sort(ListDoubly<Integer> lista) {
    Node<Integer> aux = lista.getInicio();
    while (aux != null) {
        Node<Integer> next = aux.getSiguiente();
        while (next != null) {
            if (aux.getDato() > next.getDato()) {
                int temp = aux.getDato();
                aux.setDato(next.getDato());
                next.setDato(temp);
            }
            next = next.getSiguiente();
        }
        aux = aux.getSiguiente();
    }
}



}
