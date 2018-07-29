package Singleton;

public class Singleton {

    static Singleton st = null;
    int n = 0;

    private Singleton() {
        System.out.println("In the private Singleton()");
    }

    public Singleton(int j){
        n=j;
        System.out.println("inside < public Singleton(int j) >: "+ n);
    }

    public static Singleton getInstance() {
        if (st == null) {
            System.out.println("inside < public static Singleton getInstance() >");
            st = new Singleton();
        }
        return st;
    }
}