import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;
        long ans;

        number = input.nextLong();
        ans=factor(number);
         System.out.println(ans-2);

    }

    public static long factor (long number){
        long product=1;
        int i=1;

        while(product <= number){
            product*=(i);
            i++;
        }
        return i;
    }

}


