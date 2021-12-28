import java.util.Scanner;

public class jashnvare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 2; j <= n; j++) {
                if (i * j == n) {
                    result = i;
                }
            }
        }
        System.out.println(result);
    }
}