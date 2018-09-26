package implementation;

public class MineSweeper {
    public static int[][] mineSweeper(int[][] bombs, int rows, int cols) {
        int[][] result = new int[rows][cols];

        for (int[] bomb : bombs) {
            int row = bomb[0];
            int col = bomb[1];
            result[row][col] = -1;
            for (int i = row - 1; i <= row + 1; ++i) {
                for (int j = col - 1; j <= col + 1; ++j) {
                    if (i >= 0 && i < rows && j >= 0 && j < cols && result[i][j] != -1) {
                        result[i][j] += 1;
                    }
                }
            }
        }

        return result;
    }
}
