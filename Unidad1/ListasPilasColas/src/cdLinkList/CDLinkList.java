package cdLinkList;

import lista.Lista;
import nodo.Nodo;

import java.util.Iterator;
import java.util.List;

public class CDLinkList<T extends Comparable<T>> implements Lista<T>,Iterable<T> {
    private Nodo<T> cursor, sentinela;
    private long size;

    public CDLinkList(){
        this.sentinela= new Nodo<>();
        this.size= 0;
        this.sentinela.setSiguiente(sentinela);
        this.sentinela.setAnteriror(sentinela);
        this.cursor = this.sentinela; // la lista inicia vacia
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void append(T elemento) {
        if (elemento!=null){
            Nodo<T> nuevo = new Nodo<>(elemento);
            append(nuevo);
        }else {
            IO.println("ERROR: elemento vacio");
        }

    }

    @Override
    public void append(Nodo<T> elemento) {
        if (elemento!=null){
            Nodo<T> anterior = sentinela.getAnteriror();
            elemento.setSiguiente(this.sentinela);
            elemento.setAnteriror(anterior);

            anterior.setSiguiente(elemento);
            this.sentinela.setAnteriror(elemento);
        }else {
            IO.println("ERROR: elemento vació");
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

    }

    @Override
    public Nodo<T> search(T elemento) {
        return null;
    }

    public T next(){
        return null;

    }
    public T prev(){
        return null;

    }
    public T current(){
        return null;
    }
    public void reset(){

    }
}
