package Pila;

public class Test {
    public static void main(String[] args) {
        Pila <String> p= new Pila();
        p.apilar("gato");
        p.apilar("perro");
        p.apilar("pez");
        p.apilar("raton");
        System.out.println("Dato de la pila "+ p.desapilar());
        p.imprimir();
        
    }
}
