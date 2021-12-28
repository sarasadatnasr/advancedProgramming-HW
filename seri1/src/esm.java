import java.util.Scanner;
public class esm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int count=0,max=0,h=0;

        while(count<=num) {
            String code;
            code=input.nextLine();
            char arr[]=code.toCharArray();
            int size=code.length();

            for(int i=0 ; i<size ; i++) {
                for(int j=i+1 ; j<size ; j++) {
                    if(arr[i]==arr[j])
                        arr[j]='*';
                }
            }
            for(int p=0 ; p<size ; p++) {
                if(arr[p]!='*')
                    h++;
            }
            if(h>max)
                max=h;
            count++;
            h=0;
        }

        System.out.println(max);
        input.close();
    }
}