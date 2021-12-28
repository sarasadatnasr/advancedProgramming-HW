import java.util.Scanner;

public class Ramin_MasaleRiazi {

    public static double numberOfDigit(double num1, double num2){
        double max,min;
        if(num1>=num2){
            max=num1;
            min=num2;
        }
        else {
            max=num2;
            min=num1;
        }
        max=Math.floor(Math.sqrt(max));
        min=Math.ceil(Math.sqrt(min));
        return (max-min)+1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int number= input.nextInt();
       double[] results=new double[number];
        int i=0;
        while(i<number){
            double n1= input.nextInt();
            double n2=input.nextInt();
            results[i]= numberOfDigit(n1,n2);
            i++;
        }
    for (int p=0;p<number;p++){
        System.out.println((int)results[p]);
    }
    }
}
