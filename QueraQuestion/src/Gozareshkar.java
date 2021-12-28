import java.util.Scanner;

public class Gozareshkar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int volume = input.nextInt();
        int v[] = new int[number];
        int sum = 0;
        for (int i = 0; i < number; i++) {
            v[i] = input.nextInt();
            sum += v[i];
        }
        if (sum >= volume) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


