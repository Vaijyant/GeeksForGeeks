package Interview;

public class Java {

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            String ans = "";
            if(i%3==0)
                ans = ans+"Fiz";
            if(i%5 == 0)
                ans = ans+"Buzz";


            if(ans.equals(""))
                System.out.println(i);
            else
                System.out.println(ans);
        }
    }

}
