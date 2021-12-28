import java.util.Scanner;

public class TimMeliNokhodKhori {
    public static int[] number = new int[103];

    public static void calculator(int start, int end) {
        for (int i = 1; i <= 100; i++) {
            if (start <= i && end > i) {
                number[i]++;
            }
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int[] sum = new int[103];
        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();
        int start1 = input.nextInt();
        int end1 = input.nextInt();
        int start2 = input.nextInt();
        int end2 = input.nextInt();
        int start3 = input.nextInt();
        int end3 = input.nextInt();
        calculator(start1, end1);
        calculator(start2, end2);
        calculator(start3, end3);
        for (int i = 1; i <= 100; i++) {
            if (number[i] == 1) {
                sum[i] = number[i] * one;
            } else if (number[i] == 2) {
                sum[i] = number[i] * two;
            } else if (number[i] == 3) {
                sum[i] = number[i] * three;}
             else if(number[i] == 0)  {
                 sum[i]=0;
                }
            result += sum[i];
        }
        System.out.println(result);
    }
}
