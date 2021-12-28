import java.util.*;

class kMerge {

    public static void mergeKArrays(int[][] arr, int a,int[] output){
        int c = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 4; j++){
                output[c++] = arr[i][j];
        }
        Arrays.sort(output);
    }
    public static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][100];
        int size = 0;
        int tempSize = 0;
        for(int i=0 ; i<n ; i++){
            tempSize = input.nextInt();
            System.out.println("tempSize"+tempSize);
            size += tempSize;
            for(int j=0 ; j<tempSize; j++){
                arr[i][j] = input.nextInt();
                System.out.print(arr[i][j]+" ");
            }
        }

        int[] output = new int[size];

        mergeKArrays(arr, n, output);

        System.out.println("Merged array is ");
        printArray(output, size);
    }
}


