import java.util.Scanner;
public class tac {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long number=input.nextLong();
     while(10 <= number){
         number=digit(number);
    }
System.out.println(number);
}


public static int digit(long number){
    int sum=0;
    while(number!=0){
        sum+=(number%10);
        number=number/10;
    }
    return sum;
}
}

