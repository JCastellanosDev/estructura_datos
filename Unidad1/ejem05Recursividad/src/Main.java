
void main() {
/*
printer(1);
int resultado = multiplicar(5,3);
    System.out.println(resultado);
 */

    //CLASE DEL MARTES AXELIN
double result = factorial(5);
    System.out.println(result);

    fact(10,1);

    String bin =binarioIt(12);
    System.out.println(bin);

    String bini = binarioRecursivo((long) factorial(20),"");
    System.out.println(bini);

    binVoid((long) factorial(20),"");

    collatz(13); //está seria esta vaina vegeta


   
    //////////////////////////////////// ////////////////////////////////////
    //////////////////////////////////// ////////////////////////////////////
    //////////////////////////////////// ////////////////////////////////////
    //CLASE DE MARTES
    fibo(46,0,1);

}


//////////////////////////////////// ////////////////////////////////////
//////////////////////////////////// ////////////////////////////////////
//////////////////////////////////// ////////////////////////////////////
//CLASE LUNES
void printer(int contador){
    if (contador <= 5) {
        System.out.println("i = " + contador++);
        printer(contador);
        //backtraking
    }
    }
    int multiplicar(int base, int multi) {

        if (multi > 1) {
            return base + multiplicar(base, multi - 1);


        }
        return base;
    }


//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
//CLASE MARTES
private double factorial(int i) {
    if (i >1){
        return i *factorial(i-1);
    }
    return i;
}

private void fact(int i, double resultado) {
    if (i >1){
        resultado = resultado*i--;
        fact(i, resultado);

    }else {
        System.out.println("el resultado es: " + resultado);
    }
}

String binarioIt(int i){
    String bin ="";
    int divi = 2;
    while (i >0){
        int rem = i % divi;
        i/=2;
        bin = rem+bin;
    }
    return bin;
}

private String binarioRecursivo(long entero , String s) {
    if (entero>=1){
        long rem = entero%2;
        entero/=2;
        s= rem+s;
        return binarioRecursivo(entero,s);
    }
    return s;
}

void binVoid(long valor, String bin){
    if (valor >= 1){
        long rem = valor%2;
        valor /=2;
        bin = rem+bin;
        binVoid(valor,bin);
    }else{
        System.out.println(bin);
    }

}

private void collatz(int i) {
    System.out.println(i + "");
    if (i !=1){
        if (i % 2 == 0){
            collatz(i/2);
        }else {
            collatz(3*i+1);
        }

}}

//////////////////////////////////// ////////////////////////////////////
//////////////////////////////////// ////////////////////////////////////
//////////////////////////////////// ////////////////////////////////////
//CLASE DE MARTES
private void fibo(int serie, int f0, int f1 ) {
    if (serie > 0) {
        System.out.print(f0+", ");
    fibo(--serie, f1,f0+f1);
    }else {
        System.out.println(f0);
    }

}




