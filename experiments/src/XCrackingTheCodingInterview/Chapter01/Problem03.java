package XCrackingTheCodingInterview.Chapter01;

public class Problem03 {

    public static String method1(String str) {
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        StringBuilder strB = new StringBuilder(str);
        for(int i=0; i<spaceCount; i++){
            strB.append("  ");
        }

        char[] url = strB.toString().toCharArray();
        int length = url.length;

        for (int i = str.length() - 1; i >= 0; i--) {
            if(url[i]==' '){
                url[length - 1] = '0';
                url[length - 2] = '2';
                url[length - 3] = '%';
                length = length-3;
            }
            else{
                url[length-1] = url[i];
                length--;
            }
        }
        return new String(url);
    }

    public static void main(String args[]) {
        String str = "vaijyant github io";

        //Method N: Using Java inbuilt replace function
        System.out.println("Method N: Using Java inbuilt replace function ===========");
        printAnswer(str.replace(" ", "%20"));

        //Method 1: Using Java inbuilt replace function
        System.out.println("\nMethod 1: In place operation on char[] ==================");
        printAnswer(method1(str));

    }

    public static void printAnswer(String str) {
        System.out.println("Answer: " + str);
    }
}
