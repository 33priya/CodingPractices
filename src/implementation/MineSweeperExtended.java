package implementation;

import java.util.ArrayDeque;

public class MineSweeperExtended {
    public static int[][] click(int[][] fields, int rows, int cols, int indexI, int indexJ) {
        ArrayDeque<int[]> toCheck = new ArrayDeque<>();
        if (fields[indexI][indexJ] == 0) {
            fields[indexI][indexJ] = -2;
            int[] coordinates = {indexI, indexJ};
            toCheck.add(coordinates);
        } else {
            return fields;
        }

        while(!toCheck.isEmpty()) {
            int[] currentCoordinates = toCheck.remove();
            int currentI = currentCoordinates[0];
            int currentJ = currentCoordinates[1];
            for (int i = currentI - 1; i < currentI + 2; i++) {
                for (int j = currentJ - 1; j < currentJ + 2; j++) {
                    if (0 <= i && i < rows && 0 <= j && j < cols && fields[i][j] == 0) {
                        fields[i][j] = -2;
                        int[] coordinates = {i, j};
                        toCheck.add(coordinates);
                    }
                }
            }
        }

        return fields;
    }
}
