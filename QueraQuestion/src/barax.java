import java.util.Scanner;

public class barax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[1000];
        int i = 1;
        arr[0]=input.nextInt();
        while (arr[i-1]!=0) {
            arr[i] = input.nextInt();
            i++;
        }
        while (i >= 0) {
            if (arr[i]!=0){
            System.out.println(arr[i]);}
            i--;
        }
    }
}
