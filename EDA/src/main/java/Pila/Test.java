/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author MajoLvR
 */
public class Test {
    public static void main(String[] args) {
        Pila <String> p= new Pila();
        p.apilar("gato");
        p.apilar("perro");
        p.apilar("pez");
        p.apilar("raton");
        System.out.println("Dato de la pila "+ p.desapilar());
    }
}
