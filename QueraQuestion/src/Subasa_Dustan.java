import java.util.Scanner;

public class Subasa_Dustan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int[] goals = new int[n];
        int half1 = 45;
        int half2 = 90;
        half1 += a;
        half2 += b;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            goals[i] = input.nextInt();
        }
        if (goals[n - 1] > half2) {
            possible = false;
        }
        else {
            if(n==1){
                possible=true;
            }
            else {
                for (int i = 0; i < n - 1; i++) {
                    if (goals[i] > half1 && goals[i + 1] <= half1) {
                        possible = false;
                        break;
                    }
                }
            }
        }
        if (possible) {
           System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}