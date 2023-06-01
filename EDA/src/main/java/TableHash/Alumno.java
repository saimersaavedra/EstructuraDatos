/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableHash;

/**
 *
 * @author Acer
 */
public class Alumno {
    
    private String nombre;
    private String codigo;
    private String apellido;
    private String direccion;

    public Alumno() {
    }

    public Alumno(String nombre, String codigo, String apellido, String direccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", codigo=" + codigo + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
