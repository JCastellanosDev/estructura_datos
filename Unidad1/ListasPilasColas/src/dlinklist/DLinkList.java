package dlinklist;

import lista.Lista;
import nodo.Nodo;

import java.util.Iterator;

public class DLinkList<T> implements Lista<T>,Iterable<T> {

    private Nodo<T> head,tail;

    public DLinkList() {
        this(null);
    }
    public DLinkList(T elemento) {
        this.head = new Nodo<>();
        this.tail = new Nodo<>();
        if (elemento!=null){
            Nodo<T>nuevo=new Nodo<>(elemento);
            this.head.setSiguiente(nuevo);
            this.tail.setAnteriror(nuevo);


        }
    }

    @Override
    public void append(T elemento) {
        if (elemento!=null){
            Nodo<T> nuevo=new Nodo<>(elemento);
            append(nuevo);
        }else {
            IO.println("ERROR: elemento vacio");
        }
    }

    @Override
    public void append(Nodo<T> elemento) {
        if (elemento!=null){
            if (head.getSiguiente()==null){
                tail.setAnteriror(elemento);
                head.setSiguiente(elemento);
            }else{
                Nodo<T> back = tail.getAnteriror();
                tail.setAnteriror(elemento);
                elemento.setAnteriror(back);
            }
        }
    }

    @Override
    public void reappend(T elemento) {
        if (elemento!= null){
            Nodo<T> nuevo = new Nodo<>(elemento);
            reappend(nuevo);
        }else {
            IO.println("ERROR: elemento vacio");
        }

    }

    @Override
    public void reappend(Nodo<T> elemento) {
        if (elemento!=null){
            if (head.getSiguiente()==null){
                tail.setAnteriror(elemento);
                head.setSiguiente(elemento);
            }else {
                Nodo<T> next = head.getSiguiente();
                head.setSiguiente(elemento);
                elemento.setSiguiente(next);
                next.setAnteriror(elemento);

            }

        }

    }

    @Override
    public void delete(T elemento) {

    }

    @Override
    public void delete(Nodo<T> elemento) {

    }
    @Override
    public void print() {
        if (this.tail.getSiguiente()==null){
            IO.println("La lista esta vaciaaaa");
        }else {
            print(this.tail.getAnteriror());
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
        return new Iterator<>() {
            Nodo<T> tmp=head.getSiguiente(),pos;
            @Override
            public boolean hasNext() {
                if (tmp == null) {
                    return false;
                }
                pos=tmp;
                tmp=tmp.getSiguiente();
                return true;
            }

            @Override
            public T next() {
                return pos.getElemento();
            }
        };
    }

}