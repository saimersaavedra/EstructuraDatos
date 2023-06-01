package abb;

public class Arbol<E> {
    private Node<E> raiz;
    public Node<E> getRaiz() {
        return raiz;
    }
    public void setRaiz(Node<E> raiz) {
        this.raiz = raiz;
    }
    public void insertar(Integer elemento)
    {
        if(raiz == null)
        {
            raiz = new Node(elemento);
        }
        else{
            raiz.insertar(elemento);
        }
    }
    public void inOrden(Node raiz)
    {
        if(raiz == null)
        {
            return;
        }
        else
        {
            inOrden(raiz.getArbIzq());
            System.out.println("dato: " + raiz.getDato());
            inOrden(raiz.getArbDer());
        }
    }
    public void postOrden(Node raiz)
    {
        if(raiz == null)
        {
            return;
        }
        else
        {
            postOrden(raiz.getArbIzq());
            postOrden(raiz.getArbDer());
            System.out.println("dato:" + raiz.getDato());
        }
    }
    public void preOrden(Node raiz)
    {
        if(raiz == null)
        {
            return;
        }
        else
        {
            System.out.println("dato:" + raiz.getDato());
            postOrden(raiz.getArbIzq());
            postOrden(raiz.getArbDer());
        }
    }
    public int contarHojas(Node<E> nodo)
     {
         if(nodo != null)
         {
             if(nodo.getArbIzq() == null && nodo.getArbDer() == null) return 1;
         } else return 0;
         int cantidadNodoIzd = contarHojas(nodo.getArbIzq());
         int cantidadNodoDer = contarHojas(nodo.getArbDer());
         return cantidadNodoIzd + cantidadNodoDer;
     }
     public int tamaño(Node<E> nodo)
     {
         if(nodo != null) return 1+tamaño(nodo.getArbIzq())+tamaño(nodo.getArbDer());
         else return 0;
     }
     
   Node eliminarNodoRec(Node<Integer> raiz, int valor) {
        if (raiz == null)
            return raiz;

        if (valor < raiz.getDato())
            raiz.setArbIzq(eliminarNodoRec(raiz.getArbIzq(), valor));
        else if (valor > raiz.getDato())
            raiz.setArbDer(eliminarNodoRec(raiz.getArbDer(), valor));
        else {
            if (raiz.getArbIzq() == null)
                return raiz.getArbDer();
            else if (raiz.getArbDer() == null)
                return raiz.getArbIzq();

            raiz.setDato(encontrarMinimo(raiz.getArbDer()));
            raiz.setArbDer(eliminarNodoRec(raiz.getArbDer(), raiz.getDato()));
        }

        return raiz;
    }
    
    int encontrarMinimo(Node<Integer> raiz) {
        int minimo = raiz.getDato();
        while (raiz.getArbIzq() != null) {
            minimo = (int) raiz.getArbIzq().getDato();
            raiz = raiz.getArbIzq();
        }
        return minimo;
    }

}
