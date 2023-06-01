/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial1152290_1152268;

import ListaD.ListDoubly;
import ListaD.Node;
import java.util.Objects;

/**
 *
 * @author Acer
 */
public class SegundoEjercicio {

   
    
   public static ListDoubly<Integer> fusionar(ListDoubly<Integer> lista1, ListDoubly<Integer> lista2) {
    Node<Integer> aux1 = lista1.getInicio();
    Node<Integer> aux2 = lista2.getInicio();
    ListDoubly<Integer> fusionada = new ListDoubly<>();

    while (aux1 != null && aux2 != null) {
        if (aux1.getDato() <= aux2.getDato()) {
            fusionada.addFinal(aux1.getDato());
            aux1 = aux1.getSiguiente();
        } else {
            fusionada.addFinal(aux2.getDato());
            aux2 = aux2.getSiguiente();
        }
    }

    // Agregar los elementos restantes de lista1
    while (aux1 != null) {
        fusionada.addFinal(aux1.getDato());
        aux1 = aux1.getSiguiente();
    }

    // Agregar los elementos restantes de lista2
    while (aux2 != null) {
        fusionada.addFinal(aux2.getDato());
        aux2 = aux2.getSiguiente();
    }

    return fusionada;
   }
   

}
