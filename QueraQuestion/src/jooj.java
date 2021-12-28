import java.util.Scanner;

public class jooj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j = 0;
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Ey baba :(");
                break;
            } else {
                j++;
            }
        }
        if(j==n-2){
            System.out.println("Bah Bah! Ajab jooji!");
        }
    }
}
