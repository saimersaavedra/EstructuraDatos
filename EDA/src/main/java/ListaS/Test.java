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
public class Test {
    public static void main(String[] args) {
        SimpleList<String> nombres= new SimpleList();
        nombres.add("DANI");
        nombres.add("Omar");
        nombres.add("Majo");
        nombres.add("Valya");
        nombres.addFinal("Yo");
        nombres.imprimir();
    }
}
