/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author DANIELA
 */
public class Pila <A> {
    private Node<A> cima;
    
    public boolean esVacia(){
        return cima == null;
    }

    public void apilar(A dato){
        Node n = new Node(dato, cima);
        cima = n;
    }
    
    public A desapilar(){
        if(!esVacia()){
            A dato = cima.getDato();
            cima = cima.getSiguiente();
            return dato;
        }
        return null;
    }
    
    public void imprimir(){
        Node aux = cima;
        while(aux!= null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
    /**
     * @return the cima
     */
    public Node getCima() {
        return cima;
    }

    /**
     * @param cima the cima to set
     */
    public void setCima(Node cima) {
        this.cima = cima;
    }
    
}
