void main(String[] args) {
    int[] arreglo = new int[4];

    System.out.println(arreglo.length);

    arreglo[0] = 40;
    arreglo[1]= 6;
    arreglo[2]= 7;
    arreglo[3]= 8;

    /*System.out.println(arreglo[0]);

    for (int i : arreglo) {
        System.out.println(i);

    }

     */
    for (int i = 0; i < arreglo.length; i++){
        System.out.println("Ingresa el valor: " +(i+1));
        arreglo[i] = Integer.parseInt(IO.readln());
    }

    for (int i : arreglo) {
        System.out.println(i);

    }
}