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
}
