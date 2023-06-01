/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaD;

/**
 *
 * @author MajoLvR
 */
public class Test {
        public static void main(String[] args) {
        ListDoubly<String> nombres= new ListDoubly();
        nombres.add("DANI");
        nombres.add("Omar");
        nombres.add("Majo");
        nombres.add("Valya- el primero");
        nombres.addFinal("Yo- el final");
        nombres.imprimir();
    }
}
