import linkList.LinkList;
void main(){
    LinkList<Integer> lista = new LinkList<>();

    lista.append(37);
    lista.append(83);
    lista.append(-5);
    lista.append(-100);
    for (Integer i : lista) {
        IO.println(i);

    }

    LinkList<String> nombre = new LinkList<>();
    nombre.append("Adrian");
    nombre.append("Miguel");
    nombre.append("Axel");
    nombre.append("Christian");

    //nombre.print();
    for (String s : nombre) {
        IO.println(s);
    }

}