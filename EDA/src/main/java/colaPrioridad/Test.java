package colaPrioridad;


public class Test {
    public static void main(String[] args) {
        ColaPrioridad<Integer> colaPrioridad = new ColaPrioridad<>();
        colaPrioridad.agregarElemento(5);
        colaPrioridad.agregarElemento(2);
        colaPrioridad.agregarElemento(8);
        colaPrioridad.agregarElemento(1);

        while (!colaPrioridad.estaVacia()) {
            System.out.println(colaPrioridad.obtenerElemento());
        }
    }
}