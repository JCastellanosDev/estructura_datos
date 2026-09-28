
void main(){
int [] array ={5,7,-9,10,12};
    System.out.println("");
    System.out.println("||||||||||||||||||||| Mostrar array");
    mostrar(array, 0);
    System.out.println("");
    System.out.println("||||||||||||||||||||| Mostrar una matriz");
    int[][]matriz= {{1,2,3},{4,55,6},{7,80,9}};
    mostrarMatrix(matriz,0);
    System.out.println("");
    System.out.println("||||||||||||||||||||| Mayor en un arreglo normal");
    int big = bigger(1,array[0],array);
    System.out.println(big);

    System.out.println("");
    System.out.println("||||||||||||||||||||| Mayor en un matriz");
    int matrizbig = Mbigger(1,matriz[0][0],matriz);
    System.out.println(matrizbig);
}

private int Mbigger(int i, int max, int[][]matriz) { //está vaina esta super seria vegeta
    if (i != matriz.length) {
        int _max=bigger(0, matriz[i][0],matriz[i]);
        if (_max >max){
            max = _max;
        }
        return Mbigger(i+1,max,matriz);
    }
    return max;
}

private int bigger(int i, int max, int[] array) {
    if (i != array.length){
        if (array[i]>max){
            max = array[i];
        }
        return bigger(i+1,max,array);
    }
    return max;
}

void mostrarMatrix(int[][] matriz, int i) {
    int largo = matriz.length;
    if (i != largo){
            mostrar(matriz[i],0);
        System.out.println("");
            mostrarMatrix(matriz,i+1);
        }
    }
    
void mostrar(int[] array, int contador){
    if (contador !=array.length){
        System.out.print(array[contador++] +", ");
        mostrar(array, contador);
    }
}



