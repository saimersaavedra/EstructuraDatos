/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosEquipos;

/**
 *
 * @author MajoLvR
 */
public class Jugador {
    
    private String nombre;
    private int edad;
    private double estatura;
    private int id;
    private int puntos;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, double estatura, int id, int puntos) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.id = id;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + ", Edad = " + edad + ", Estatura = " + estatura + ", ID = " + id + ", Puntos = " + puntos;
    }
    
    
     
    
}
