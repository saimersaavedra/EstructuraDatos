/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial1152290_1152268;

import ListaD.ListDoubly;

/**
 *
 * @author Acer
 */
public class Test {

    public static void main(String[] args) {
        PrimerEjercicio();
        SegundoEjercicio();
        TercerEjercicio();

    }

    public static void PrimerEjercicio() {

        ListDoubly<Integer> listaInicial = new ListDoubly();
        int x = 5;
        listaInicial.addFinal(3);
        listaInicial.addFinal(5);
        listaInicial.addFinal(8);
        listaInicial.addFinal(5);
        listaInicial.addFinal(10);
        listaInicial.addFinal(2);
        listaInicial.addFinal(1);
        ListDoubly<Integer> listaFinal = PrimerEjercicio.separar(listaInicial, x);

        listaFinal.imprimir();
    }

    public static void SegundoEjercicio() {

        ListDoubly<Integer> lista1 = new ListDoubly();
        ListDoubly<Integer> lista2 = new ListDoubly();
        ListDoubly<Integer> fusionada;

        lista1.add(1);
        lista1.add(2);
        lista1.add(4);
        lista2.add(1);
        lista2.add(3);
        lista2.add(4);

        System.out.println("Lista 1: ");
        lista1.imprimir();
        System.out.println("Lista 2: ");
        lista2.imprimir();

        fusionada = SegundoEjercicio.fusionar(lista1, lista2);
        fusionada.sort(fusionada);
        System.out.println("La lista fusionada es: ");
        fusionada.imprimir();

    }

    public static void TercerEjercicio() {
           
        ListDoubly<Integer> l1 = new ListDoubly();
        ListDoubly<Integer> l2 = new ListDoubly();
        ListDoubly<Integer> l3 = new ListDoubly();
        ListDoubly<Integer> l4 = new ListDoubly();
        ListDoubly<Integer> l5 = new ListDoubly();
        ListDoubly<Integer> l6 = new ListDoubly();
        
        l1.addFinal(1);
        l1.addFinal(3);
        l1.addFinal(2);
        l1.addFinal(4);
        l1.addFinal(6);
        l2.addFinal(1);
        l2.addFinal(3);
        l2.addFinal(2);
        l2.addFinal(5);
        l3.addFinal(1);
        l3.addFinal(3);
        l3.addFinal(3);
        l3.addFinal(4);
        l3.addFinal(5);
        l4.addFinal(1);
        l4.addFinal(3);
        l4.addFinal(3);
        l5.addFinal(1);
        l5.addFinal(3);
        l5.addFinal(3);
        l5.addFinal(4);
        l6.addFinal(1);
        l6.addFinal(3);
        l6.addFinal(3);
        l6.addFinal(4);
        
        System.out.println("Lexicord entre lista 1 y lista 2?: " + TercerEjercicio.Lexicord(l1, l2));
        System.out.println("Lexicord entre lista 3 y lista 4?: " + TercerEjercicio.Lexicord(l3, l4));
        System.out.println("Lexicord entre lista 5 y lista 6?: " + TercerEjercicio.Lexicord(l5, l6));
        
        
        
        
    }

}
