/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAsociacion;

import ListaD.ListDoubly;

/**
 *
 * @author MajoLvR
 */
public class Asociacion {
   
    ListDoubly <Mascota> mascotas;
    
    public Asociacion(){
        mascotas =new ListDoubly();
    }
    public void add(Mascota mascota){
        mascotas.add(mascota);
    }
    
    
    public void verMascotas(){
        mascotas.imprimir();
    }
    
    public Mascota buscar(Mascota mascotaB){
        return mascotas.buscar(mascotaB);
    }
    
    public Mascota Eliminar(Mascota mascotaE){
        return mascotas.eliminar(mascotaE);
    }
                
}
