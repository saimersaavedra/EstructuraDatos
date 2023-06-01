/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAsociacion;

/**
 *
 * @author MajoLvR
 */
public class Test {
    public static void main(String[] args) {
        Asociacion a= new Asociacion();
        a.add(new Mascota("001", "Pelusa", 8, "11111"));
        a.add(new Mascota("002", "Churrias", 4, "22222"));
        a.add(new Mascota("003", "Chifu", 1, "333333"));
        a.add(new Mascota("004", "Michi", 5, "44444"));
        a.verMascotas();
    
    }
}
