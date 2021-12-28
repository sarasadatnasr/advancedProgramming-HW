import java.util.Scanner;

public class DayerehAjib {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int k= input.nextInt();
        System.out.println(calculate(n,k));
    }
    public static int calculate(int n,int k){
        int n1=n;
        while(n%k!=0){
            n+=n1;
        }
        return n/k;
    }

}
