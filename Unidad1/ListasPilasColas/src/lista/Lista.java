package lista;

import nodo.Nodo;

public interface Lista <T>{
    void append(T elemento);
    void append(Nodo<T> elemento);  //agrega al final

    void reappend(T elemento);
    void reappend(Nodo<T> elemento); // desde head

    void delete(T elemento);
    void delete(Nodo<T> elemento);

    void print(); // iterador
    Nodo<T> search(T elemento);

}
