package SegundoParcial2;

import Pila.Pila;
import Cola.Cola;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        Ejercicio e = new Ejercicio();
        System.out.println("Ejercicio 1-----");
        Pila<Integer> p2 = new Pila();
        p2.apilar(1);
        p2.apilar(2);
        p2.apilar(3);
        p2.apilar(4);
        p2.apilar(5);
        System.out.println(e.sacarFondoPila(p2));
        System.out.println("Ejercicio 2----");
        LinkedList<Integer> cola = new LinkedList<Integer>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);

        int n = 3;

        for (int i = 0; i < n; i++) {
            int temp = cola.removeLast();
            cola.addFirst(temp);
        }

        System.out.println(cola);
        System.out.println("Ejercicio 3-----");
        Pila<Integer> p = new Pila();
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(5);
        p.apilar(6);
        p.apilar(7);
        p.apilar(8);
        p.apilar(9);
        p.imprimir();
        System.out.println("Quitando pares----");
        e.quitarElementosImpares(p);
        p.imprimir();
        System.out.println("Ejercicio 4----");
        Cola<Integer> c = new Cola();
        c.encolar(1);
        c.encolar(2);
        c.encolar(3);
        c.encolar(5);
        System.out.println(e.promedio(3, c));

        

    }
}
