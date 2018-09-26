package implementation;

public class Rotate2DArray {

    public static int[][] rotate(int[][] a, int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                result[j][n - 1 - i] = a[i][j];
            }
        }

        return result;
    }

    public static int[][] rotateInPlace(int[][] a, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {

            }
        }

        return a;
    }
}
