/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author MajoLvR
 */
public class Pila<A> {
    Node <A> cima;//cima de la pila
    private int tamano;

    public Node getCima() {
        return cima;
    }

    public void setCima(Node cima) {
        this.cima = cima;
    }
    
    public void apilar(A dato){
        Node nuevo = new Node(dato, cima); //se crea nuevo nodo y este pasa a ser la cima
        cima=nuevo;
        setTamano(getTamano() + 1);
    }
    public A desapilar(){
        if(vacia()){
            return null;
        }
        else{
            A dato = cima.getDato();
            cima= cima.getSiguiente();
            setTamano(getTamano() - 1);
            return dato;
        }
    }
    
    public boolean vacia(){
        return cima==null;
    }
    
    public void imprimir(){
        Node <A> aux =  cima;
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
