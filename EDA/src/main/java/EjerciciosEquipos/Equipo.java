/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosEquipos;

import ListaD.Node;
import ListaD.ListDoubly;

/**
 *
 * @author MajoLvR
 */
public class Equipo {

    String nombre;
    ListDoubly<Jugador> equipo;

    public Equipo() {
        equipo = new ListDoubly();
    }

    public void add(Jugador jugador) {
        equipo.add(jugador);
    }

    public void verEquipo() {
        equipo.imprimir();
    }

    public ListDoubly<Jugador> ilegal() {
        int min = 18;
        ListDoubly<Jugador> ilegales = new ListDoubly<>();
        Node<Jugador> aux = equipo.getInicio();

        while (aux != null) {
            if (aux.getDato().getEdad() < min) ilegales.add(aux.getDato());
            aux = aux.getSiguiente();
        }
        return ilegales;
    }

    public Jugador JugadorEstrella() {

        if (equipo.esVacia()) {
            return null;
        }
        Node<Jugador> aux = equipo.getInicio();
        Jugador jugadorEstrella = aux.getDato();
        while (aux != null) {
            if (aux.getDato().getPuntos() > jugadorEstrella.getPuntos()) jugadorEstrella = aux.getDato();
            aux = aux.getSiguiente();
        }
        return jugadorEstrella;
    }
    
    public void aumentarPuntos(){
        
        Node<Jugador> aux = equipo.getInicio();
        while(aux != null){
            aux.getDato().setPuntos(aux.getDato().getPuntos() + 5);
            aux = aux.getSiguiente();
        }
    }
    
    public ListDoubly<Jugador> ventianeros(){
        
        ListDoubly<Jugador> jugadores = new ListDoubly<>();
        int tmp = 0;
        Node<Jugador> aux = equipo.getInicio();
        while(aux != null){
            if(aux.getDato().getEdad() >= 20 && aux.getDato().getEdad() <= 25){
                jugadores.add(aux.getDato());
                tmp++;
            }
            aux = aux.getSiguiente();
        } 
        System.out.println("La cantidad de jugadores entre 20 y 25 es: " + tmp);
        return jugadores;
    }

    public Jugador buscarCedula(int id){
        Node<Jugador> aux = equipo.getInicio();
        while(aux != null){
            if(aux.getDato().getId() == id) return aux.getDato();
            
            aux = aux.getSiguiente();
        }  
        return null;
    }
    
    
}
