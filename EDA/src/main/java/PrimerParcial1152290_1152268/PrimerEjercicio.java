/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial1152290_1152268;

import ListaD.ListDoubly;
import ListaD.Node;

/**
 *
 * @author Acer
 */
public class PrimerEjercicio {

    public static ListDoubly<Integer> separar(ListDoubly<Integer> lista, int x) {

        ListDoubly<Integer> izquierda = new ListDoubly<>();

        ListDoubly<Integer> derecha = new ListDoubly<>();

        Node<Integer> aux = lista.getInicio();

        while (aux != null) {
            if (aux.getDato() < x) {
                izquierda.add(aux.getDato());
            } else {
                derecha.add(aux.getDato());
            }
            aux = aux.getSiguiente();
        }
        Node<Integer> aux1 = izquierda.getInicio();
        Node<Integer> aux2 = derecha.getInicio();

        ListDoubly<Integer> listafinal = new ListDoubly<>();

        while (aux1 != null) {
            listafinal.addFinal(aux1.getDato());
            aux1 = aux1.getSiguiente();
        }

        while (aux2 != null) {
            listafinal.addFinal(aux2.getDato());
            aux2 = aux2.getSiguiente();
        }

        return listafinal;
    }
}
