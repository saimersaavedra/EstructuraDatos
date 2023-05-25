package SegundoParcial;

import Pila.Pila;
import Cola.Cola;


public class Test {
    public static void main(String[] args) {
        Ejercicio e = new Ejercicio();
        Pila <Integer> p = new Pila();
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(5);
        p.imprimir();
        System.out.println("Sacando el numero del fondo----------");
        e.sacarFondo(p).imprimir();
        System.out.println("Ejercicio 2 ------------------");
        Cola c = new Cola();
        c.encolar(12);
        c.encolar(4);
        c.encolar(23);
        c.encolar(10);
        c.encolar(1);
        c.imprimir();
        System.out.println("Invirtiendo datos");
        e.invierte(c).imprimir();
        System.out.println("Ejercicio 3 ------------");
        Pila <Integer> p1 = new Pila();
        p1.apilar(9);
        p1.apilar(2);
        p1.apilar(8);
        p1.apilar(6);
        p1.apilar(7);
        p1.apilar(5);
        p1.apilar(3);
        p1.apilar(2);
        p1.apilar(4);
        p1.apilar(3);
        p1.apilar(1);
        p1.imprimir();
        System.out.println("Reordenando-------------");
        e.reordenar(p1).imprimir();
        System.out.println("Ejercicio 4 ----------");
        Cola c1 = new Cola();
        c1.encolar(1);
        c1.encolar(3);
        c1.encolar(5);
        c1.encolar(2);
        c1.encolar(4);
        c1.imprimir();
        System.out.println("Rotando-----------");
        e.rotacion(c1).imprimir();
    }
}
