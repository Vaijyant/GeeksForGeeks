package BitWise;

public class EvenOdd {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        System.out.println(a & 1);
        System.out.println(b & 1);

        if ((a & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }

}
