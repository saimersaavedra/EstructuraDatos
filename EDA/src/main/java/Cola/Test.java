/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author MajoLvR
 */
public class Test {
    public static void main(String[] args) {
        Cola c =new Cola();
        c.encolar("1");
        c.encolar("2");
        c.encolar("3");
        c.encolar("4");
        System.out.println("Dato desencolado: "+ c.desencolar());
    }
}
