package XCrackingTheCodingInterview.Chapter01;

public class Problem09 {

    public static boolean method1(String str, String rStr) {

        if (rStr.length() == str.length() && rStr.length() > 0) {
            String duplicate = str + str;
            return duplicate.indexOf(rStr) > 0 ? true : false;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "VaijyantTomar";
        String rStr = "TomarVaijyant";

        printAnswer(method1(str, rStr));
    }

    public static void printAnswer(boolean flag) {
        if (flag)
            System.out.println("\'rStr\' is a rotation of \'str\'.");
        else
            System.out.println("\'rStr\' is not a rotation of \'str\'.");

    }
}
