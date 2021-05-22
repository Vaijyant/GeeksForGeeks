package test;

public class Capital {

    public static void main(String[] args) {
        int i = 1;
        while(i<=10) {
            System.out.println("Hole Count (" + i+"): "+ solution(i));
            i++;
        }
    }

    public static int solution(int holeCount) {

        int num = 0;
        while (true) {
            int currentNumHoleCount = countHoles(num);
            if (currentNumHoleCount == holeCount) return num;
            num++;
        }

    }

    public static int countHoles(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            count = count + getHoles(number % 10);
            number = number / 10;
        }
        return count;
    }

    public static int getHoles(int digit) {
        if (digit == 1 || digit == 2 || digit == 3 || digit == 5 || digit == 7) return 0;
        else if (digit == 0 || digit == 4 || digit == 6 || digit == 9) return 1;
        else return 2;
    }

}
