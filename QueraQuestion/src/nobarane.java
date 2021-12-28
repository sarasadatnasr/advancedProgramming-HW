import java.util.Scanner;

public class nobarane {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int up = 0;
        int n1 = input.nextInt();
        if (n1 >= 80) {
            up++;
        }
        int n2 = input.nextInt();
        if (n2 >= 80) {
            up++;
        }
        int n3 = input.nextInt();
        if (n3 >= 80) {
            up++;
        }
        int n4 = input.nextInt();
        if (n4 >= 80) {
            up++;
        }
        int n5 = input.nextInt();
        if (n5 >= 80) {
            up++;
        }
        print(up);
    }
    public static void print(int n){
        if(n>=3){
            System.out.println("Mamma mia!");
        }
        else if(n<3 && n>=1){
            System.out.println("Mamma mia!!");
        }
        else {
            System.out.println("Mamma mia!!!");
        }

    }


}
