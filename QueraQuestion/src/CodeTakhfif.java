import java.util.Scanner;
import java.util.Arrays;
    public class CodeTakhfif{

        static String removeDupsSorted(String str){
            int res_ind = 1, ip_ind = 1;

            char arr[] = str.toCharArray();
            while (ip_ind != arr.length){

                if(arr[ip_ind] != arr[ip_ind-1]){
                    arr[res_ind] = arr[ip_ind];
                    res_ind++;
                }
                ip_ind++;
            }

            str = new String(arr);
            return str.substring(0,res_ind);
        }

        static String removeDups(String str){
            char temp[] = str.toCharArray();
            Arrays.sort(temp);
            str = new String(temp);
            return removeDupsSorted(str);
        }

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            String valid = input.next();
            String[] result = new String[number];

            for (int i = 0; i < number; i++) {
                String random = input.next();
                if (removeDups(valid).equals(removeDups(random))){
                    result[i] = "Yes";
                }
                else {
                    result[i] = "No";
                }
            }
            for (int j = 0; j < number; j++) {
                System.out.println(result[j]);
            }
        }

    }

