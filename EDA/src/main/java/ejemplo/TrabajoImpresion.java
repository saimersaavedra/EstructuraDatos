/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author Estudiante
 */
public class TrabajoImpresion implements Comparable<TrabajoImpresion>{
    
    private int numeroHojas;
    private String nombreArchivo;

    public TrabajoImpresion(int numeroHojas, String nombreArchivo) {
        this.numeroHojas = numeroHojas;
        this.nombreArchivo = nombreArchivo;
    }

    public boolean equals(TrabajoImpresion otro){
        return this.getNombreArchivo().equals(otro.nombreArchivo);
    }

    @Override
    public int compareTo(TrabajoImpresion o) {
        if(this.equals(o))
        return 0;
        else if(this.getNumeroHojas() >= o.getNumeroHojas())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "TrabajoImpresion-->{" + "numeroHojas=" + numeroHojas + ", nombreArchivo=" + nombreArchivo + '}';
    }
    
    

    /**
     * @return the numeroHojas
     */
    public int getNumeroHojas() {
        return numeroHojas;
    }

    /**
     * @param numeroHojas the numeroHojas to set
     */
    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    /**
     * @return the nombreArchivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * @param nombreArchivo the nombreArchivo to set
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
}
