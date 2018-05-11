package Singleton;

public class Singleton {

    static Singleton st = null;
    int n = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (st == null)
            st = new Singleton();
        return st;
    }
}

