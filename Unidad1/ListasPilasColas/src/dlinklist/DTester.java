import dlinklist.DLinkList;

void main() {
    DLinkList<String> name = new DLinkList<>();

    name.reappend("hola");
    name.reappend("como");
    name.reappend("estas");

    for (String s : name) {
        IO.println(s);

    }

    name.print();
}
