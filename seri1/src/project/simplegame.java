package project;
import java.util.Scanner;
import java.util.Arrays;
public class simplegame {
        int[][][] gPoints = new int[4][4][2];
        String[] table = new String[8];
        String[] TempTable = new String[8];
        int[][] marks=new int[4][4];



public void initialize() {
    int Points[][][]={{ {1, 2 },{1, 6},{1, 10},{1, 14}},
        {{3, 2 },{3, 6},{3, 10},{3, 14}},
        {{5, 2 },{5, 6},{5, 10},{5, 15}},
        {{8, 2 },{8, 6},{8, 10},{8, 14}},
        {{10,2 },{10,6},{10,10},{10,14}},
        {{12,2 },{12,6},{12,10},{12,14}}};

    for (int i=0;i<6; i++)
        for (int j=0; j<6; j++)
            for (int k=0; k<2; k++){
                gPoints[i][j][k]=Points[i][j][k];
            }

    String[] table = new String[8];
    table[0] = "┌───┬───┬───┬───┐";
    table[1] = "│   │   │   │   │";
    table[2] = "├───┼───┼───┼───┤";
    table[3] = "│   │   │   │   │";
    table[4] = "├───┼───┼───┼───┤";
    table[5] = "│ 2 │   │   │   │";
    table[6] = "├───┼───┼───┼───┤";
    table[7] = "│   │   │ 2 │   │";
    table[7] = "└───┴───┴───┴───┘";


}

        public void two() {
            int[][] two = new int[17][8];
            for (int j = 1; j < 14; j += 2) {
                for (int i = 2; i < 14; i += 4) {
                    if (two[i][j] == ' ') {
                        two[i][j] = 2;
                    }
                }
            }
        }
 public void move(int ch) {
      int[][] board = new int[17][8];
       for (int k=0 ; k<8 ; k++){
            TempTable[k] = table[k];
       }
     for (int i = 0; i < 14; i++)
     {
         System.out.println(TempTable[i] );
     }

//left
            if (ch == 75) {
                for (int j = 1; j < 14; j += 2) {
                    for (int i = 2; i < 14; i += 4) {
                        if (board[i][j] == board[i + 4][j]) {
                            board[i][j] = board[i][j] + board[i + 4][j];
                            board[i + 4][j] = ' ';
                        } else {
                            board[i][j] = board[i + 4][j];
                            board[i + 4][j] = ' ';
                        }
                    }
                }
            }
//right
            if (ch == 77) {
                for (int j = 1; j < 14; j += 2) {
                    for (int i = 2; i < 14; i += 4) {
                        if (board[i][j] == board[i + 4][j]) {
                            board[i + 4][j] = board[i][j] + board[i + 4][j];
                            board[i][j] = ' ';
                        } else {
                            board[i][j + 4] = board[i][j];
                            board[i][j] = ' ';

                        }
                    }
                }
            }
            //up
            if (ch == 72) {
                for (int j = 1; j < 14; j += 2) {
                    for (int i = 2; i < 14; i += 4) {
                        if (board[i][j] == board[i][j + 2]) {
                            board[i][j] = board[i][j + 2] + board[i][j];
                            board[i][j + 2] = ' ';
                        } else {
                            board[i][j] = board[i][j + 2];
                            board[i][j + 2] = ' ';
                        }
                    }
                }
            }
   //down
            if (ch == 80) {
                for (int j = 1; j < 14; j += 2) {
                    for (int i = 2; i < 14; i += 4) {
                        if (board[i][j] == board[i][j + 2]) {
                            board[i][j + 2] = board[i][j + 2] + board[i][j];
                            board[i][j] = ' ';
                        } else {
                            board[i][j + 2] = board[i][j];
                            board[i][j] = ' ';
                        }
                    }
                }
            }
        }

public static boolean endgame() {
    int p=0;
    boolean endgame=false;
    int[][] end = new int[17][8];
        for (int j = 1; j < 14; j += 2) {
            for (int i = 2; i < 14; i += 4) {
                if (end[i][j] !=' ') {
                    p++;
                    if(p==16){
                        endgame =true;
                    }
                }
            }
        }
    return endgame;
    }

public static void main(ُ){
    Scanner input = new Scanner(System.in);
    int ch;
    initialize();
    do{
       ch= input.nextInt();
       move(ch);
       two();
    }while (!endgame());

}
}