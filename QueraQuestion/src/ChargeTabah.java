import java.util.Arrays;
import java.util.Scanner;

public class ChargeTabah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
            if (arr[1] + y >= 100 && arr[0]>=(n-1)*x) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

}
