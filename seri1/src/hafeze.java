import java.util.Scanner;
public class hafeze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  j = 0;
        int number = input.nextInt();
        int[] arrey = new int[number];
        String shape;
        shape = input.next();
        char source;
        arrey[j] = 0;
        int size = shape.length();

        for(int i=0; i<size ;i++) {
            source = shape.charAt(i);
            if (source == '>'&& j!=number-1) {
                j++;
            }
            else if (source == '>'&& j==number-1) {
                j = 0;
            }
            else if (source == '<'&& j!=0) {
                j--;
            }
            else if (source == '<'&& j==0) {
                j = number - 1;
            }
            else if (source == '+') {
                arrey[j]++;
            }
            else if (source == '-') {
                arrey[j]--;
            }

        }


            for (int k = 0; k<number; k++) {
                System.out.print(arrey[k]);
                System.out.print(" ");
            }

    }
}

