package Interview.CompanyA;

public class Steping {
    public static void main(String[] args) {

        int counter = 0;
        int[] input = {2, 1, 1, 3, 4};

        for (int i = 0; i < input.length; i = i + input[i]) {
            counter++;
        }
        System.out.println(counter - 1);
    }
}
