import java.util.Scanner;

public class BoxInTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int[][] arr=new int[n+1][m+1];
        int x=1,y=1;
        int currentElement;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                arr[i][j]=input.nextInt();
            }
        }
        int g=0;

        while (g<k){
            System.out.println("level"+g);
        currentElement=arr[x][y];

        if(isPrime(currentElement)){
            double row=(n/2)+0.5;
            double column=(m/2)+0.5;
            double tempRow=row-x;
            double tempColumn= column-y;
            x=(int)(row+tempRow);
            y=(int)(column+tempColumn);
            System.out.println(x+" "+y);

        }
        else {

            switch (currentElement % 4){
            case 0:
                if (x < n) {
                    x++;
                } else {
                    y=1;
                }
                System.out.println(x+" "+y);

            case 1:
                if (y < m) {
                    y++;
                } else {
                    x=1;
                }
                System.out.println(x+" "+y);

            case 2:
                if (x > 1) {
                    x--;
                } else {
                    y=m;
                }
                System.out.println(x+" "+y);

            case 3:
                if (y > 1) {
                   y--;
                } else {
                    x=n;
                }
                System.out.println(x+" "+y);
            }
        }
        g++;
    }
        System.out.println(x+" "+y);

}


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}