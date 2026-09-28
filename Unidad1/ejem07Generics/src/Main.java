
void main() {
    Integer [] array        = new Integer[10];
    Double [] arrayD    = new Double[]{4.5,6.7,8.9,10d};
    String [] arrayS    = new String[]{"AA", "BB", "C","DD","EE"};
    ArrayList<Integer> list = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    printer(array);
    System.out.println("|||||||||||||||||||||||||||||||||||||||");
    printer(arrayD);
    System.out.println("|||||||||||||||||||||||||||||||||||||||");
    printer(arrayS);
}

/*void printer (int[] array){
    for (int i : array) {
        System.out.println(array[i]+ " ");

    }
}

 */

<T> void printer(T[] array){
    for (int i = 0; i < array.length ; i++) {
        System.out.println(array[i]);

    }

}