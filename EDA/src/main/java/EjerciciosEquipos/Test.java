/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosEquipos;
import ListaD.ListDoubly;
import java.util.Scanner;
/**
 *
 * @author MajoLvR
 */
public class Test {
    
    public static void main(String[] args) {
        
        Equipo insanos = new Equipo();
        
        Jugador j1 = new Jugador("Majo", 17, 1.67, 111, 48);
        Jugador j2 = new Jugador("Alex", 16, 1.74, 222, 15);
        Jugador j3 = new Jugador("Assaf", 22, 1.69, 333, 32);
        Jugador j4 = new Jugador("Omar", 24, 1.78, 444, 12);
        Jugador j5 = new Jugador("Andres", 20, 1.82, 555, 19);
        Jugador j6 = new Jugador("Danielita", 20, 1.64, 666, 18);
        Jugador j7 = new Jugador("Matias", 27, 1.74, 777, 42);
        Jugador j8 = new Jugador("Guerrero", 19, 1.75, 888, 32);
       
        insanos.add(j1);
        insanos.add(j2);
        insanos.add(j3);
        insanos.add(j4);
        insanos.add(j5);
        insanos.add(j6);
        insanos.add(j7);
        insanos.add(j8);
        
        
        //R1. Jugadores con menor edad
        System.out.println("Jugadores menores de edad: ");
        ListDoubly<Jugador> ilegales = insanos.ilegal();
        ilegales.imprimir();
        
        //R2. Buscar jugador por número de cédula
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula del jugador a buscar");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Jugador jugadorEncontrado = insanos.buscarCedula(id);
        
        if (jugadorEncontrado != null){
            System.out.println("El jugador correspondiente al numero de cedula ingresado es: " + jugadorEncontrado.getNombre());
        } else {
            System.out.println("No se ha encontrado ningun jugador con ese numero de cedula :c ");
        }

        //R3. Mostrar el jugador con mayor puntaje
        Jugador jugadorGod = insanos.JugadorEstrella();
        System.out.println("El jugador con mayor puntaje es: " + jugadorGod.getNombre() + " con " + jugadorGod.getPuntos() + " puntos :D");
        
        //R4. Aumentar 5 puntos a todos los jugadores
        insanos.aumentarPuntos();
        System.out.println("Los nuevos puntajes son: ");
        insanos.verEquipo();
        
        
        //R5. Indicar cuántos y cuáles son los jugadores que están entre 20 y 25
        
        System.out.println("Los jugadores entre 20 y 25 son: ");
        insanos.ventianeros().imprimir();
        
        
    }
    
}
