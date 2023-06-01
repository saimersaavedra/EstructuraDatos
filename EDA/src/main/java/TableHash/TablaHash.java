/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableHash;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class TablaHash {
    public static void main(String[] args) {
        Map <String, Alumno> mapa = new HashMap<>();
        Alumno a = new Alumno("Maria", "1152268", "Lopez", "Venezuela");
        Alumno b = new Alumno("Andrea", "1111", "Torrado", "Pachito");
        Alumno c = new Alumno("Matias", "2222", "UFPS", "Pachito");
        mapa.put(a.getCodigo(), a);
        mapa.put(b.getCodigo(), b);
        mapa.put(c.getCodigo(), c);
        
        System.out.println(mapa.get(a.getCodigo().toString()));
        System.out.println(mapa.get(b.getCodigo().toString()));
        System.out.println(mapa.get(c.getCodigo().toString()));
    }
    
}
