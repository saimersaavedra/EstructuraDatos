package abb;

public class test {

    public static void main(String[] args) {
        Arbol uno = new Arbol();
        uno.insertar(5);
        uno.insertar(3);
        uno.insertar(7);
        uno.insertar(10);
        uno.insertar(4);
        uno.insertar(6);
        uno.insertar(1);
        uno.insertar(2);

        System.out.println("In - Orden");
        uno.inOrden(uno.getRaiz());
        System.out.println("Post - Orden");
        uno.postOrden(uno.getRaiz());
        System.out.println("Pre - Orden");
        uno.preOrden(uno.getRaiz());
        System.out.println("Hojas: "+uno.contarHojas(uno.getRaiz()));
        System.out.println("Tamaño: "+uno.tamaño(uno.getRaiz()));
    }
}
