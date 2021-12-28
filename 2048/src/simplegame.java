import java.util.Scanner;
import java.util.Random;
public class simplegame {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int[][] board = new int[4][4];
        System.out.println("Hi!,welcome to 2048");
        System.out.println("press (d) to move right, (a) to move left,(s)to move down,(w)to move up");

                board[0][0] = 2;
                board[3][3] = 2;


        printBoard(board);

        while (!endGame(board)) {
            String move = input.next();

            if (move.equals("a") || move.equals("A")) {
                leftMove(board);
            }
            if (move.equals("s") || move.equals("S")) {
                downMove(board);
            }
            if (move.equals("d") || move.equals("D")) {
                rightMove(board);
            }
            if (move.equals("w") || move.equals("W")) {
                upMove(board);
            }
            printRandomTwo(board);
            printBoard(board);
        }
    }
//this function checks grids to end of game
    public static boolean endGame(int[][] arr) {

        int p = 0;
        boolean end = false;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (arr[i][j] != 0) {
                    p++;
                }
            }
        }
        if (p == 16) {
            end = true;
        }
        return end;
    }
//these four function control the side of moving
    public static void leftMove(int[][] arr) {
        //arr=new int[4][4];
        int i, j, li, ri;
        for (j = 0; j < 4; j++) {
            li = 0;
            ri = j;
            for (i = 1; i < 4; i++) {
                if (arr[i][j] != 0) {
                    if (arr[i - 1][j] == 0 || arr[i - 1][j] == arr[i][j]) {
                        if (arr[li][ri] == arr[i][j]) {
                            arr[li][ri] *= 2;
                            arr[i][j] = 0;
                        } else {
                            if (arr[li][ri] == 0) {
                                arr[li][ri] = arr[i][j];
                                arr[i][j] = 0;
                            } else {
                                arr[++li][ri] = arr[i][j];
                                arr[i][j] = 0;
                            }
                        }
                    } else li++;
                }
            }
        }
    }

    public static void rightMove(int[][] arr) {

        int i, j, li, ri;
        for (j = 0; j < 4; j++) {
            li = 3;
            ri = j;
            for (i = 2; i >= 0; i--) {
                if (arr[i][j] != 0) {
                    if (arr[i + 1][j] == 0 || arr[i + 1][j] == arr[i][j]) {
                        if (arr[li][ri] == arr[i][j]) {
                            arr[li][ri] *= 2;
                            arr[i][j] = 0;
                        } else {
                            if (arr[li][ri] == 0) {
                                arr[li][ri] = arr[i][j];
                                arr[i][j] = 0;
                            } else {
                                arr[--li][ri] = arr[i][j];
                                arr[i][j] = 0;
                            }
                        }
                    } else li--;
                }
            }
        }
    }

    public static void upMove(int[][] arr) {
        // arr=new int[4][4];
        int i = 0, j, li, ri;
        for (i = 0; i < 4; i++) {
            li = i;
            ri = 0;
            for (j = 1; j < 4; j++) {
                if (arr[i][j] != 0) {
                    if (arr[i][j - 1] == 0 || arr[i][j - 1] == arr[i][j]) {
                        if (arr[li][ri] == arr[i][j]) {
                            arr[li][ri] *= 2;
                            arr[i][j] = 0;
                        } else {
                            if (arr[li][ri] == 0) {
                                arr[li][ri] = arr[i][j];
                                arr[i][j] = 0;
                            } else {
                                arr[li][++ri] = arr[i][j];
                                arr[i][j] = 0;
                            }
                        }
                    } else ri++;
                }
            }
        }
    }

    public static void downMove(int[][] arr) {
        int i, j, li, ri;
        for (i = 0; i < 4; i++) {
            li = i;
            ri = 3;
            for (j = 2; j >= 0; j--) {
                if (arr[i][j] != 0) {
                    if (arr[i][j + 1] == 0 || arr[i][j + 1] == arr[i][j]) {
                        if (arr[li][ri] == arr[i][j]) {
                            arr[li][ri] *= 2;
                            arr[i][j] = 0;
                        } else {
                            if (arr[li][ri] == 0) {
                                arr[li][ri] = arr[i][j];
                                arr[i][j] = 0;
                            } else {
                                arr[li][--ri] = arr[i][j];
                                arr[i][j] = 0;
                            }
                        }
                    } else ri--;
                }
            }
        }
    }
//this function prints 2 in random position
    public static void printRandomTwo(int[][] arr) {
        Random rand = new Random();
        int li, ri;
        boolean empty = true;
        while (empty) {
            li = rand.nextInt(4);
            ri = rand.nextInt(4);
            if (arr[li][ri] == 0) {
                arr[li][ri] = 2;
                empty = false;
            }

        }

    }
//this function print board everytime after inputing char
    public static void printBoard(int[][] arr) {
        //int[][] Board = new int[4][4];

        for (int j = 0; j < 4; j++) {
            if (j == 0) {
                System.out.print("\n┌────┬────┬────┬────┐\n");
            }
            System.out.print("│");
            for (int i = 0; i < 4; i++) {
                System.out.print(" ");
                if (arr[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(arr[i][j] );
                }
                System.out.print("  │");
            }


            if (j != 3) {
                System.out.print("\n├────┼────┼────┼────┤\n");
            } else {
                System.out.print("\n└────┴────┴────┴────┘\n");
            }
        }
    }
 }

