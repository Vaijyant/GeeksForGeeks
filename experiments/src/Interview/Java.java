package Interview;

public class Java {

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ": FizBuzz");
            else if (i % 3 == 0)
                System.out.println(i + ": Fiz");
            else if (i % 5 == 0)
                System.out.println(i + ": Buzz");
        }
    }

}
