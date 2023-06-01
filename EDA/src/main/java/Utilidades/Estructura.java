/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Utilidades;

/**
 *
 * @author MajoLvR
 */
public interface Estructura<A>{
    public void add(A dato);
    public void addFinal(A dato);
    public boolean vacia();
    public A buscar(A dato);
    public A eliminarInicio();
    public A eliminarFinal();
    public A eliminar(A dato);
}
