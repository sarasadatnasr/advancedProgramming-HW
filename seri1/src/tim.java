import java.util.Scanner;
public class tim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min1;
        int min2;
        int min3;
        int sum;
        int[] arr=new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextInt();
        }
        if (arr[0] >= arr[1]) {
            min1 = arr[1];
        }
        else {
            min1 = arr[0];
        }

        if (arr[2] >= arr[3]) {
            min2 = arr[3];
        } else {
            min2 = arr[2];
        }

        if (arr[4] >= arr[5]) {
            min3 = arr[5];
        } else {
            min3 = arr[4];
        }
        sum = min1 + min2 + min3;
        System.out.println(sum);


    }
}