import java.util.Scanner;

public class Cheragh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int position = 0;
        int n = input.nextInt();
        int[] arr = new int[n];
        arr[0] = input.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i]=input.nextInt();
            if (arr[i] != arr[i - 1]) {
                position++;
            }
        }
        System.out.println(position);
    }
}