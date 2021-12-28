import java.util.ArrayList;
import java.util.Scanner;

public class piadero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        int[] jadval = new int[n + 1];
        ArrayList<Integer> bad = new ArrayList<Integer>();
        String[] answer = new String[n + 1];
        int p = 1;

        for (int i = 1; i <= n; i++) {
            jadval[i] = input.nextInt();
            if (i >= 2 && jadval[i] == jadval[i - 1]) {
                bad.add(i) ;
                p++;
            }
        }

        for (int i = 1; i <= q; i++) {
            int start = input.nextInt();
            int end = input.nextInt();
            for (int k=start+1;k<=end;k++){
                if (bad.contains(k)) {
                    answer[i] = "NO";
                    break;
                } else {
                    answer[i] = "YES";
                }
            }
        }

        for (int i = 1; i <=q; i++) {
            System.out.println(answer[i]);
        }
    }
}