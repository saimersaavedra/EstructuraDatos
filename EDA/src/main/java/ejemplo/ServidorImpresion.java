
package ejemplo;

import java.util.PriorityQueue;

/**
 *
 * @author Estudiante
 */
public class ServidorImpresion {
    public static void main(String[] args) {
        
        TrabajoImpresion t1 = new TrabajoImpresion(2, "Almacen Catar");
        TrabajoImpresion t2 = new TrabajoImpresion(6, "Almacen Catar");
        TrabajoImpresion t3 = new TrabajoImpresion(3, "Barcelona S.A.");
        TrabajoImpresion t4 = new TrabajoImpresion(2, "Zapateria Gloria");
    
        PriorityQueue<TrabajoImpresion> pQueue = new PriorityQueue<TrabajoImpresion>();
        pQueue.add(t1);
        pQueue.add(t2);
        pQueue.add(t3);
        pQueue.add(t4);
        
        while (!pQueue.isEmpty()){
            System.out.println("Dqueue" + "-->" + pQueue.remove());
        } 
        
        
    }

}
