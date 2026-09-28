
void main() {
    int[] array = {1, 2, 3, 4, 5};
    System.out.println(array[0]);

    //arreglo de arreglos
    int[][] matrix = new int[3][];

    /*
    int [][] matrix2 = {{1,2,3}
            ,           {4,5,6},
                        {7,8,9}};

    System.out.println(matrix2[2][2]);
     */
    /*
    matrix[0] = new int []{1};
    matrix[1] = new int []{4,5};
    matrix[2]= new int []{6,7,8};

     */

    matrix[0] = new int[1];
    matrix[1] = new int[2];
    matrix[2] = new int[3];

    matrix[0][0] = 1;
    matrix[1][0] = 2;
    matrix[1][1] = 3;
    matrix[2][0] = 4;
    matrix[2][1] = 5;
    matrix[2][2] = 6;

    //para imprimir solo arreglos multidimensionales
    //System.out.println(Arrays.deepToString(matrix));

    //manera tradicional para imprimir arreglos multidimensionales
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.println(matrix[i][j]);
        }
        System.out.println("");
    }


    String a= "=";
    System.out.println(a.repeat(10));
    System.out.println("ForEach");
    //foreach
    for (int[] ints : matrix) {
        for (int x : ints) {
            System.out.println(" "+ x);
        }
        System.out.println("");
    }

    int[][][] cube = new int[3][3][3];
    filler(cube);
    fillarray(new int[]{1,2}, new int[]{3,4,5}, new int[]{3,4,5,6});
}
void fillarray(int[] ...valores){
    System.out.println(Arrays.deepToString(valores));
}

private void filler(int[][][] cube) {
    for(int i = 0; i < cube.length; i++){
        for(int j = 0; j < cube[i].length; j++){
            for(int k = 0; k < cube[i][j].length; k++){

                System.out.printf("Ingresa el valor [%d][%d][%d]: ", i, j, k);
                cube[i][j][k] = Integer.parseInt(IO.readln());
            }
        }
    }
}


