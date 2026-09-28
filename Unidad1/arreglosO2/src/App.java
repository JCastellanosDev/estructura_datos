void main() {
/*
    // arreglo abierto
        double [] array = new double[10];

        array[2] = 1;
        System.out.println(Arrays.toString(array));

    // arreglo cerrado
        double [] array2 = {2.3,4.5,6,7,-5.6};

    //  no me acuerdo
        double [] array3 = new double[]{1.2,3.4,5.6,7.8};
        System.out.println(Arrays.toString(array3));
     
     // memoria por referencia   
        capturar(array);
        double sumatoria = sumar(array);
    System.out.println("El resultado de la usma es: " + sumatoria);
    System.out.println(Arrays.toString(array));

    sumare(1,2,3);
}

double sumare(double ... array){
    double acumulador =0;
    for (double v : array) {
        acumulador += v;
    }
    return acumulador;
}

private double sumar(double[] array) {
    double acumulador =0;
    for (double v : array) {
        acumulador += v;
    }
    return acumulador;
}

private void capturar(double[] array) {
    for (int i = 0; i< array.length; i++){
        System.out.println("Ingrese el elemento "+ (i+1));
        array[i] = Double .parseDouble(IO.readln());
    }


 */
    /*
    int[] resultado = metodico(new int[]{12,31,2,1,2,1,2,3,1,2});
    System.out.println(Arrays.toString(resultado));

     */

    int[] resultado1 = alFinal(new int[]{12,31,2,1,2,1,2,3,1,2}, 2);

    System.out.println(Arrays.toString(resultado1));
    alFinal(resultado1, 12);
    System.out.println(Arrays.toString(resultado1));
    System.out.println(Arrays.toString(metodico(resultado1)));

}
/*
 hacer un metodo que reciba como parametro un arreglo de enteros
 el metodo contara por ejemplo cuantos son 1 y 2
 el metodo retornara un arreglo de 2 posiciones
 en donde ne la posicion 0 dira la cantidad de 1
 y en la posicion 1 dira la cantidad de 2
 */
int [] metodico(int[] array) {
    int[] aux = new int [2];
    for (int numero : array) {
        if (numero == 1) {
            aux[0]++;
        } else if (numero == 2) {
            aux[1]++;
        }

    }
    return aux;
}
int [] alFinal(int[] array, int valor){
    int[] aux = new int [array.length];
    int posicion = 0;

    for (int a : array) {
        if (a != valor) {
            aux[posicion] = a;
            posicion++;
        }
    }
        while (posicion < array.length){
            aux[posicion] = valor;
            posicion++;
        }
    return aux;
}

int [] acomodaditos(int[] array, int valor ){
return null;
}

