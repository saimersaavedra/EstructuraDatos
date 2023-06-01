/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAsociacion;

/**
 *
 * @author Acer
 */
public class TestHashMap {
    public static void main(String[] args) {
        
        AsociacionTablaHash at = new AsociacionTablaHash();
        at.add(new Mascota("632", "Firulays", 1, "1111"));
        at.add(new Mascota("222", "Clemensio", 2, "2222"));
        at.add(new Mascota("541", "Rigoberto", 3, "3333"));
        
//        at.imprimir();
        
        System.out.println("Mascota: " + at.buscarID(new Mascota("222")).toString());
    }
    
}
