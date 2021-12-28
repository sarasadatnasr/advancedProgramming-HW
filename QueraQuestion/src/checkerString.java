import java.util.Scanner;

public class checkerString {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str1 = input.next();
            String str2 = input.next();
            char start = str1.charAt(0);
            char end = str2.charAt(str2.length() - 1);

            if (start == end) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

}
