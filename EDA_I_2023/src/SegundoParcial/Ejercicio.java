/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoParcial;

import Colas.Cola;
import Colas.Node;
import Pilas.Node;
import Pilas.Pila;

/**
 *
 * @author DANIELA
 */
public class Ejercicio<A> {
    
    public Pila sacarFondo(Pila p){
        Pila  nueva = new Pila();
        Node <A> aux = p.getCima();
        while(aux.getSiguiente().getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(null);
        nueva = p;
        return nueva;
    }
    
    public Cola invierte(Cola c){
        Pila p = new Pila();
      //  Nodo <A> aux = c.getInicio();
        while(!c.vacia()){
            p.apilar(c.desencolar());
        }
        while(!p.vacia()){
            c.encolar(p.desapilar());
        }
        return c;
    }
    
    public Pila reordenar(Pila p){
        Pila nueva = new Pila();
        Pila n  = new Pila();
        Pila impares = new Pila();
        while(!p.vacia()){
            int valor = (int)p.desapilar();
            if(valor %2  == 1){
                impares.apilar(valor);
            }
            else{
                n.apilar(valor);
            }
        }
        while(!impares.vacia()){
            nueva.apilar(impares.desapilar());
        }
        while(!n.vacia()){
            nueva.apilar(n.desapilar());
        }
        return nueva;
    }
    
    public Cola rotacion(Cola c){
        Nodo <Integer> aux = c.getInicio();
        while(aux != null && aux.getDato() % 2 ==1){
            c.encolar(c.desencolar());
            aux = aux.getSiguiente();
        }
        return c;
    }
}
