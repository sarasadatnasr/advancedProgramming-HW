import java.util.Scanner;
public class Light {

        public static void main(String args[]){
            Scanner input=new Scanner(System.in);
            int num=input.nextInt();
            int[] status=new int[num];
            for(int i=0;i<num;i++){
                status[i]=input.nextInt();
            }
            int change=0;
            for(int j=0;j<num-1;j++){
                if(status[j]!=status[j+1]) {
                change++; }

            }
        System.out.println(change);
}}
