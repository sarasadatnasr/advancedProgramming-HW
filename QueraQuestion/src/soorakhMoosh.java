import java.util.Scanner;

 public class soorakhMoosh {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x1= input.nextInt();
        int x2= input.nextInt();
        if(x1<x2){
            right(x1,x2);
        }
        else if(x1>x2){
            left(x1,x2);
        }
        else if(x1==x2){
            System.out.println("Saal Noo Mobarak!");
        }
    }

    public static void right(int x1,int x2){
        while(x1<x2){
            x1++;
            System.out.print("R");
        }
}
     public static void left(int x1,int x2) {
         while (x1>x2) {
             x1--;
             System.out.print("L");
         }
     }
}
