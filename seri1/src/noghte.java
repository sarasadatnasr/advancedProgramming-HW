import java.util.Scanner;
public class noghte {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        int positive=0,negative=0;

        for(int i=0 ; i<(number); i++ ){
            int x=input.nextInt();
            int y=input.nextInt();
            if(x>0){
                positive ++;
            }
            else {
                negative ++;
            }

        }

        if(positive<=1 || negative<=1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

}


