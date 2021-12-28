import java.util.Scanner;
public class one {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        boolean fisa=false;
        int square1=num1*num1;
        int square2=num2*num2;
        int square3=num3*num3;
        if(square1+square2==square3){
            fisa=true;
        }
        else if(square3+square2==square1){
            fisa=true;
        }
        else if(square1+square3==square2){
            fisa=true;
        }
        if(fisa){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
}}
