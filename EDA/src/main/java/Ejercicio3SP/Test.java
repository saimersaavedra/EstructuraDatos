/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3SP;

import Cola.Cola;
import Pila.Pila;

/**
 *
 * @author Acer
 */
public class Test {
    public static void main(String[] args) {
        Ejercicio e = new Ejercicio();
        Cola c = new Cola();
        c.encolar(2);
        c.encolar(1);
        c.encolar(2);        
        c.encolar(3);       
        c.encolar(2);
        //c.imprimir();
        //e.eliminar_valor(c, 2).imprimir();
       Pila p = new Pila();
      /* p.apilar(4);
       p.apilar(3);
       p.apilar(2);
       p.apilar(1);*/
       
   //p.imprimir();
   
       //e.junta(p, 6).imprimir();
       //e.reorganizable(p,2);
       //e.reorganizable(p, 5).imprimir();
       
       //Metodo 4 
       p.apilar(2);
       p.apilar(1);
       p.apilar(3);
       p.apilar(2);
       p.apilar(1);
       p.apilar(5);
       p.apilar(3);
       
       e.eliminarMenor(p).imprimir();
    }
}
