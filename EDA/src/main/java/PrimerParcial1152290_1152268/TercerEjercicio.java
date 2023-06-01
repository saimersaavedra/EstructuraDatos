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
public class TercerEjercicio {
    
    public static boolean Lexicord(ListDoubly<Integer> lista1, ListDoubly<Integer> lista2){
        
        Node<Integer> aux1 = lista1.getInicio();
        Node<Integer> aux2 = lista2.getInicio();
        boolean lexicord = false;
        
        while(aux1 != null && aux2 != null){
            if(aux1.getDato() > aux2.getDato()){
                lexicord = true;
                break;
            } 
            else if(aux1.getDato() < aux2.getDato()){
                lexicord = false;
                break;
            } else{
                aux1 = aux1.getSiguiente();
                aux2 = aux2.getSiguiente();
            }
            
           
        }
        
        if(aux1 != null && aux2 != null) lexicord = true;
        
        return lexicord;
    }
    
    
}
