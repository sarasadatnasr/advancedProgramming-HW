import java.util.Scanner;

public class Nafasgir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            result += (arr1[i] * arr2[i]);

        }
        System.out.println(result);
    }
}
