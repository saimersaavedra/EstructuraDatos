/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAsociacion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class AsociacionTablaHash {
    
    Map<String, Mascota> mascotas;
    
    public AsociacionTablaHash(){
        this.mascotas = new HashMap<>();
    }
    
    public Mascota buscarID(Mascota mascota){
        return mascotas.get(mascota.getId());
    }
    
    public Mascota buscarPropietario(Mascota mascota){
        for (Map.Entry<String, Mascota> inicio : mascotas.entrySet()) {
            String key = inicio.getKey();
            Mascota value = inicio.getValue();
            if (value.getCedula().equals(mascota.getCedula())) {
                return value;
            }
            return null;
        }
        
        return null;
    }
    
    public void add(Mascota mascota){
    
        mascotas.put(mascota.getId(), mascota);
    }
    
    public void imprimir(){
        for (String key : mascotas.keySet()) {
            Mascota mascota = mascotas.get(key);
            System.out.println("Nombre: " + mascota.getNombre());
        }
    }
    
}
