import java.util.Scanner;
import java.lang.Math;
public class Sabavasoalsade {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int k= input.nextInt();
        int result,s;
        s=pow(k);
        result=n/s;
        if(n<0){
            result--;
        }
        System.out.println(result);
    }
public static int pow(int k){
        int result=1;
        for(int i=0;i<k;i++){
            result*=2;
        }
        return result;
}
}
