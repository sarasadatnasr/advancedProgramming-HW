import java.util.Scanner;

public class Barcode {
    //global array
   public static char[][] array = new char[9][9];

   //check if 3*3 array is valid
    public static boolean checkArrays() {
        boolean result=true;
        char[][] array1 = new char[3][3];
        char[][] array2 = new char[3][3];
        char[][] array3 = new char[3][3];
        char[][] array4 = new char[3][3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                array1[i][j]=array[i][j];
                array[i][j]='0';
            }
        }
        for (int j = 6; j < 9; j++) {
            for (int i = 0; i < 3; i++) {
                array2[i][j-6]=array[i][j];
                array[i][j]='0';
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 6; i < 9; i++) {
                array3[i-6][j]=array[i][j];
                array[i][j]='0';
            }
        }
        for (int j = 6; j < 9; j++) {
            for (int i = 6; i < 9; i++) {
                array4[i-6][j-6]=array[i][j];
                array[i][j]='0';
            }
        }

        if(!equal(array1)){
            result=false;
        }

        if(!equal(array2)){
            result=false;
        }
        if(!equal(array3)){
            result=false;
        }
        if(!equal(array4)){
            result=false;
        }

        return result;

    }


// check how many barcodes are possible
    public static int checkMain(){
        int answer=0;
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
              if (array[i][j]=='2'){
                  answer++;
              }
            }
        }
        return answer;
    }


//math pow
    public static long pow(int n){
        int i=0;
        long answer=1;
        if(n!=0){
            while(i<n){
                answer=answer*2;
                i++;
            }
        }
        else {
            answer=0;
        }
        return answer;
    }


// check pattern 3*3 array
    public static boolean equal(char[][] arr) {
        char[][] sampleArray = {{'1', '1', '1'}, {'1', '0', '1'}, {'1', '1', '1'}};
        boolean result = true;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if(arr[i][j]!='2'){
                     if (sampleArray[i][j]!=arr[i][j]) {
                        result = false;
                        break;
                     }
                }
                else {
                    arr[i][j]='*';
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] line = new String[9];
        for (int p = 0; p < 9; p++) {
            line[p] = input.next();
        }
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                array[i][j] = line[j].charAt(i);
            }
        }

        boolean isPossible =checkArrays();
        int n=checkMain();


        if(isPossible){
        System.out.println(pow(n));
        }
        else {
            System.out.println("0");
        }
    }



}




