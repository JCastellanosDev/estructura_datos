package linkList;

import lista.Lista;
import nodo.Nodo;

import java.util.Iterator;

public class LinkList<T> implements Lista<T>, Iterable<T> {
    private Nodo<T> head;

    public LinkList() {
        this(new Nodo<>());
    }

    public LinkList(Nodo<T> head){
        if (head == null) {this.head = new Nodo<>(); }
        this.head= head;
    }


    @Override
    public void append(T elemento) {
        if (elemento == null){
            IO.println("ERROR: elemento no puede ser nulo");
        }else {
           append(new Nodo<>(elemento));
        }

    }

    private void append(Nodo<T> siguiente,Nodo<T> elemento){
        if (siguiente.getSiguiente() == null){
            siguiente.setSiguiente(elemento);
        }else {
            append(siguiente.getSiguiente(),elemento);
        }
    }

    @Override
    public void append(Nodo<T> elemento) {
        if (elemento == null){
            IO.println("ERROR: elemento no puede ser nulo");
        }else {
            if (this.head.getSiguiente() == null){
                this.head.setSiguiente(elemento);
            }else {
                append(this.head.getSiguiente(),elemento);
            }
        }

    }

    @Override
    public void reappend(T elemento) {

    }
    @Override
    public void reappend(Nodo<T> elemento) {

    }

    @Override
    public void delete(T elemento) {

    }
    @Override
    public void delete(Nodo<T> elemento) {

    }

    @Override
    public void print() {
        if (this.head.getSiguiente()==null){
            IO.println("La lista esta vaciaaaa");
        }else {
            print(this.head.getSiguiente());
        }
    }

    private void print(Nodo<T> siguiente) {
        if (siguiente != null){
            IO.println(siguiente.getElemento());
            print(siguiente.getAnteriror());
        }
    }

    @Override
    public Nodo<T> search(T elemento) {
        return null;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Nodo<T> temporal = head.getSiguiente(),pos;
            @Override
            public boolean hasNext() {
                if (temporal==null){
                    return false;
                }
                pos = temporal;
                temporal = temporal.getSiguiente();
                return true;
            }

            @Override
            public T next() {
                return pos.getElemento();
            }
        };
    }
}
