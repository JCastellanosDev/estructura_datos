package nodo;

public class Nodo<T> {
    private T elemento;
    private Nodo<T> siguiente, anteriror;

    public Nodo(){
        this(null);
    }

    public Nodo(T elemento){
        this.elemento= elemento;
        this.siguiente= null;
        this.anteriror=null;
    }

    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo<T> getAnteriror() {
        return anteriror;
    }
    public void setAnteriror(Nodo<T> anteriror) {
        this.anteriror = anteriror;
    }
}
