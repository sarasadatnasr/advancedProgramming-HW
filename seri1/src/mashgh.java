import java.util.Scanner;
public class mashgh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ang1;
        int ang2;
        int ang3;
        int sum;

        ang1 = input.nextInt();
        ang2 = input.nextInt();
        ang3 = input.nextInt();
        sum = ang1 + ang2 + ang3;

        if(sum==180 && ang1!=180 && ang2!=180 && ang3!=180 && ang1!=0 && ang2!=0 && ang3!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
}
