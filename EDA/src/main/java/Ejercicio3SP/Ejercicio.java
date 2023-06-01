/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3SP;

import Cola.Cola;
import Cola.Nodo;
import Pila.Pila;
import Pila.Node;

/**
 *
 * @author 1152268-1152282
 */
public class Ejercicio {
    
    public Cola eliminar_valor(Cola c, int n){
        Cola nueva = new Cola();
        Nodo<Integer> aux = c.getInicio();
        while(aux != null){
            if(aux.getDato() != n) nueva.encolar(aux.getDato());
            aux = aux.getSiguiente();
        }
        return nueva;
    }
    
    public Pila junta(Pila p, int n){
        int suma = 0;
        for(int i = 0; !p.vacia() && i < n; i++){
            suma += (Integer) p.desapilar();
        }
        p.apilar(suma);
        return p;
    }
    
    public Pila reorganizable(Pila p, int n){
        Node <Integer> aux=  p.getCima();
        Node <Integer> prev=  p.getCima();
        while(aux!= null){
            if(aux.getDato() == n){
                prev.setSiguiente(aux.getSiguiente());
            }
            prev = aux;
            aux = aux.getSiguiente();
        }
        p.apilar(n);
        return p;
    }
    
    public Pila eliminarMenor(Pila p){
        Node <Integer> aux=  p.getCima().getSiguiente();
        Node <Integer> prev=  p.getCima();
        int menor = (Integer)p.getCima().getDato();
        while(aux != null){
            if(aux.getDato() < menor) menor = aux.getDato();
            aux = aux.getSiguiente();
        }
        aux =  p.getCima();
        while(aux != null){
            if(aux.getDato() == menor){
                prev.setSiguiente(aux.getSiguiente());
            }
            prev = aux;
            aux = aux.getSiguiente();
        }
        prev.setSiguiente(new Node(menor, null));
        return p;
    }
}
