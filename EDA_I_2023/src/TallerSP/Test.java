package TallerSP;

import Colas.Cola;
import Pilas.Pila;

public class Test {
    public static void main(String[] args) {
        Ejercicio uno = new Ejercicio ();
        
        System.out.println("EJERCICIO 2");
        Pila<Integer> pila1 = new Pila<>();
        pila1.apilar(2);
        pila1.apilar(3);
        pila1.apilar(4);
        pila1.apilar(5);
        pila1.apilar(2);
        pila1.apilar(3);
        pila1.apilar(1);

        System.out.println("Pila original: ");
        pila1.imprimir();

        uno.junta(pila1, 4);
        System.out.println("Pila después: ");
        pila1.imprimir();

        System.out.println("EJERCICIO 3");
        Pila<Integer> pila3 = new Pila<>();
        pila3.apilar(1);
        pila3.apilar(3);
        pila3.apilar(5);
        pila3.apilar(4);
        pila3.apilar(2);
        pila3.apilar(3);
        pila3.apilar(7);
        pila3.apilar(3);
        pila3.apilar(5);

        System.out.println("Pila original:");
        pila3.imprimir();
        uno.pila_Reorganizable(pila3, 3);
        System.out.println("Pila después");
        pila3.imprimir();

        System.out.println("EJERCICIO 4");
        Pila<Integer> pila4 = new Pila<>();
        pila4.apilar(1);
        pila4.apilar(2);
        pila4.apilar(4);
        pila4.apilar(2);
        pila4.apilar(3);
        pila4.apilar(5);
        pila4.apilar(2);

        System.out.println("Pila original:");
        pila4.imprimir();

        uno.insertarPequeño(pila4);

        System.out.println("Pila despues de insertar el elemento mas pequeño:");
        pila4.imprimir();
        
        Cola dos = new Cola();
        System.out.println("EJERCICIO 1");
        dos.encolar(1);
        dos.encolar(3);
        dos.encolar(5);
        dos.encolar(4);
        dos.encolar(2);
        dos.encolar(3);
        dos.encolar(7);
        dos.encolar(3);
        dos.encolar(5);
        uno.eliminar_Valor(dos, 3);
        
    
    }

}
