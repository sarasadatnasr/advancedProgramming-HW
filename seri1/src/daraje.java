import java.util.Scanner;
public class daraje {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int number;
        int sum=0;
        int[] year = new int[100];
        number = input.nextInt();

        for (i = 1; i < number; i++) {
            year[i] = input.nextInt();
        }
        int start = input.nextInt();
        int end= input.nextInt();
        for(i=start ; i<end ;i++){
            sum+=year[i];}
    System.out.println(sum);
    }
}