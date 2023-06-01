/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaS;

import Utilidades.Estructura;

/**
 *
 * @author MajoLvR
 */
public class SimpleList <A> implements Estructura <A>{
    Node inicio;
    Node fin;

    @Override
    public void add(A dato) {
        Node nuevo=new Node();
        nuevo.setDato(dato);
        if(inicio == null){
            inicio=nuevo;
            fin=nuevo;
            
        }
        else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
            
        }
    }

    @Override
    public void addFinal(A dato) {
        Node nuevo=new Node();
        nuevo.setDato(dato);
        /*if(inicio==null){  con este se recorre eL ARREGLO PARA AGREGAR AL FINAL SIN crear la variable fin.
            inicio = nuevo;
        }
        else{
            Node aux=inicio;
            while(aux.getSiguiente()!=null){
                aux= aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);*/
        if(inicio==null){
            inicio = nuevo;
            fin=nuevo;
        }
        else{
           fin.setSiguiente(nuevo);
           fin= nuevo;
           }
        
        }
        public void imprimir(){
        Node aux =inicio;
            while(aux!=null){
                System.out.println("El dato es : "+ aux.getDato());
                aux=aux.getSiguiente();
            } 
        }
    @Override
        public boolean vacia(){
        return inicio ==null;
    }
    @Override
        public A buscar(A dato){
            Node aux=inicio;
            A buscado=null;
            while(aux!= null){
                if(aux.getDato()==dato){
                    buscado=dato;
                    return buscado;
                }
                else{
                    aux=aux.getSiguiente();
                }
            }
            return buscado;
        }
    @Override
        public A eliminarInicio(){
           Node aux=inicio;
           if(inicio!=null){
               if(inicio==fin){
                   inicio=null;
                   fin=null;
               }
               else{
                   inicio.getSiguiente();
               }
           }
           return (A)aux.getDato();
        }
    @Override
        public A eliminarFinal(){
            if(inicio==null){
                return null;
            }
            else if (inicio == fin) {
                Node eliminado = inicio;
                inicio = null;
                fin = null;
                return (A) eliminado.getDato();
            }
            else {
                Node aux = inicio;
                Node anterior = null;
                while (aux.getSiguiente() != null) {
                    anterior = aux;
                    aux = aux.getSiguiente();
                }
                anterior.setSiguiente(null);
                fin = anterior;
                return (A) aux.getDato();
            }
            
        }
    @Override
        public A eliminar(A dato){
            Node aux=inicio;
            A eliminado=null;
            while(aux!= null){
                if(aux==dato){
                    aux=null;
                    eliminado=dato;
                }
                else{
                    aux=aux.getSiguiente();
                }
            }
            return eliminado;
            
        }
    }

    

