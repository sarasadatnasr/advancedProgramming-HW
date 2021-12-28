import java.util.Scanner;

public class saddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        String[][] grid = new String[n+1][m+1];
        String[] row = new String[n];
        for (int i = 0; i < n; i++) {
            row[i] = input.next();
            grid[i] = row[i].split("");
        }
        int answer = 0;
        for (int j = 1; j < m - 1; j++) {
            for (int i = 1; i < n - 1; i++) {
                if (convert(grid[i][j]) > convert(grid[i - 1][j]) && convert(grid[i][j]) > convert(grid[i + 1][j])) {
                    if (convert(grid[i][j]) < convert(grid[i][j - 1]) && convert(grid[i][j]) < convert(grid[i][j + 1])) {
                        answer++;
                    }
                } else if (convert(grid[i][j]) < convert(grid[i - 1][j]) && convert(grid[i][j]) < convert(grid[i + 1][j])) {
                    if (convert(grid[i][j]) > convert(grid[i][j - 1]) && convert(grid[i][j]) > convert(grid[i][j + 1])) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static int convert(String str){
        int n=Integer.parseInt(str);
        return n;
    }
}