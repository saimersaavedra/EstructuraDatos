package Cola;

public class Cola<A> {
    Nodo <A>inicio;
    int tamaño;
    Nodo <A>fin;

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }
    
    public void encolar(A dato){
        Nodo nuevo = new Nodo(dato, null);
        if (inicio==null){
            inicio=nuevo;
            fin=nuevo;
        }
        else{
            
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
        tamaño++;
    }
    
    public A desencolar(){
        
        if(vacia()){
            return null;
        }
        else{
           A dato =inicio.getDato();
           inicio=inicio.getSiguiente();
           tamaño--;
           return dato;
            
        }
        
       
    }
    public boolean vacia(){
        return inicio==null;
    }
    
    public void imprimir(){
        Nodo<A> aux = getInicio();
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
   
}
