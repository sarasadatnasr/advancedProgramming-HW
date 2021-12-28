import java.util.Scanner;
public class three {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        long answer=0;
        long result=factorial(number);
        System.out.println(factorial(number));
        while (true){
            answer=result%10;
            if(answer!=0){
                System.out.println(answer);
                break;
            }
            else {
            result=result/10;}
        }
    }
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

