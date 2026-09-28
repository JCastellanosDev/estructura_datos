package data;

public class Bag <T> {
    private T attr1;
    public Bag(T a){
        this.attr1 = a;

    }

    public Bag(){
        this.attr1 = null;
    }

    public void printer(){
        System.out.println("Bag " + this.attr1);
    }
}
