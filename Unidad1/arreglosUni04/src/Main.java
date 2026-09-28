import javax.management.StringValueExp;

void main(String[] args) {

    int mayor = buscarMayor(new int[]{-1,-5,10,26,30});
    System.out.println("Mayor es: "+ mayor);

    int [] array= new int[10];
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(1,20);
    }
    System.out.println(Arrays.toString(array));

    invertidito(array);


    String [] fizz = fizzBuzz(array);
    System.out.println(Arrays.toString(fizz));


    String word = "";
    System.out.println("Ingrese la palabra  buscar: ");
    word  = IO.readln();
    jueguito(word);
    /*
    int[] inv= new int[]{10,20,30,2,1,4};
    for (int i = 0; i < inv.length; i++) {
        int incremento = 0;
        int decremento = inv.length - 1;
        inv[incremento] = inv[decremento];
        incremento++;
        decremento++;


     */

    }

private void jueguito( String word) {
    String[] blocks = {
            "BO", "XK", "DQ", "CP", "NA", "GT", "RE", "TG", "QD",
            "FS", "JW", "HU", "VI", "AN", "OB", "ER", "FS", "LY", "PC", "ZM"
    };
    for (int i = 0; i < word.length(); i++) {
        String letter = String.valueOf(word.charAt(i));
        System.out.println(letter);
        for (int j = 0; j < blocks.length; j++) {
            if (blocks[j].contains(letter)){
                
            }

        }
    }

}

private String[] fizzBuzz(int[] fizz) {
    for (int i = 0; i < 100; i++) {
        if (i % 3 == 0 && i%5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Bzz");

        } else {
            System.out.println(i);
        }

    }

    return new String[0];
}

void invertidito(int[] array) {
    int incremento =0;
    int decremento = array.length -1;
    int aux = array[incremento];
    for (int i = 0; i < array.length; i++) {
        aux = array[incremento];
        array[incremento] = array[decremento];
        array[decremento] = aux;
        incremento++;
        decremento--;




    }
    System.out.println(Arrays.toString(array));
}

//hacer un metodo que reciba como parametro un arreglo
    // de enteros  y determine cual es el mayor de todos





private int buscarMayor(int[] ints) {
    int mayor = ints[0];
    for (int i = 1; i < ints.length; i++) {
        if (ints[i] > mayor) {
            mayor = ints[i];

        }
    }
    return mayor;
}
/*
private OptionalInt buscarMayor(int[] arreglo) {
    OptionalInt resultado = OptionalInt.of(0);
    resultado = Arrays.stream(arreglo).max();
    return resultado;

 */


