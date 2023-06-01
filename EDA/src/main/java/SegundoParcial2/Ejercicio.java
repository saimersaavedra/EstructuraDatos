package SegundoParcial2;

import Cola.Cola;
import Cola.Nodo;
import Pila.Node;
import Pila.Pila;
import java.util.LinkedList;

public class Ejercicio<A> {
    
    
    public int sacarFondoPila(Pila p)
    {
        int mayor =0;
        if(!p.vacia())
        {
            while(!p.vacia())
            {
                int elemento = (Integer) p.getCima().getDato();
                if(elemento > mayor)
                {
                    mayor = elemento;
                }
                p.desapilar();
            }
        }
        return mayor;
    }
     
    public Pila quitarElementosImpares(Pila p){
         Node <Integer> aux = p.getCima();
         Pila nueva = new Pila();
        while(aux != null && aux.getDato() / aux.getDato() ==1){
            if(aux.getDato() % 2 == 1)
            {
                aux.setDato(null);
            }
            else
            {
                 p.apilar(p.desapilar());
            }
            aux = aux.getSiguiente();
        }
        nueva = p;
        return nueva;
    }
 
    public float promedio(int n,Cola c){
        float promedio = 0;
        while(c.getTamaño() != n)
        {
            c.desencolar();
          
        }
       
        while(!c.vacia())
        {
             float elemento = (Integer) c.getInicio().getDato();
             promedio += elemento;
             c.desencolar();
        }
        
        promedio /= n;
        return promedio;
    }
}
