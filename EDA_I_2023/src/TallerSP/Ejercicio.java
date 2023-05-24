package TallerSP;
import Colas.Cola;
import Colas.Node;
import Pilas.Pila;

public class Ejercicio {
    public void eliminar_Valor (Cola Q,int n){
        Node <Integer> aux = Q.getInicio();
        while(aux != null){
            if(aux.getDato() != n){
                System.out.println(aux.getDato());
                Q.encolar(aux);
            }
            else {
                Q.desencolar();
            }
            aux = aux.getSiguiente();
        }
    }
    public void junta(Pila<Integer> pila, int m) {
        Pila<Integer> aux = new Pila<>();
        int suma = 0;
        int contador = 0;

        while (!pila.esVacia() && contador < m) {
            suma += pila.desapilar();
            contador++;
        }

        aux.apilar(suma);

        while (!pila.esVacia()) {
            aux.apilar(pila.desapilar());
        }

        while (!aux.esVacia()) {
            pila.apilar(aux.desapilar());
        }
    }
    public void pila_Reorganizable(Pila<Integer> pila, int n) {
        Pila<Integer> pilaTemp = new Pila<>();

        boolean encontrado = false;

        while (!pila.esVacia()) {
            Integer dato = pila.desapilar();
            if (dato.equals(n)) {
                encontrado = true;
            }
            pilaTemp.apilar(dato);
        }

        if (encontrado) {
            pilaTemp.desapilar();
        }

        pilaTemp.apilar(n);

        while (!pilaTemp.esVacia()) {
            pila.apilar(pilaTemp.desapilar());
        }
    }
     public void insertarPequeño(Pila<Integer> pila) {
        if (pila.esVacia()) {
            return;
        }

        Integer elementoPequeñoo = null;
        Pila<Integer> aux = new Pila<>();

        while (!pila.esVacia()) {
            Integer dato = pila.desapilar();
            if (elementoPequeñoo == null || dato < elementoPequeñoo) {
                elementoPequeñoo = dato;
            }
            aux.apilar(dato);
        }

        while (!aux.esVacia()) {
            Integer dato = aux.desapilar();
            if (!dato.equals(elementoPequeñoo)) {
                pila.apilar(dato);
            }
        }
        pila.apilar(elementoPequeñoo);
    }
}
