package test;

import implementation.MineSweeper;
import junit.framework.TestCase;

import static org.junit.Assert.*;

public class MineSweeperTest extends TestCase {

    public void testMineSweeper() {
        int[][] bombs1 = {{0, 2}, {2, 0}};
        int[][] result1 = {{0, 1, -1},{1, 2, 1},{-1, 1, 0}};
        assertArrayEquals(MineSweeper.mineSweeper(bombs1, 3, 3), result1);


        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        int[][] result2 = {{-1, -1, 2, 1},{2, 3, -1, 1},{0, 1, 1, 1}};
        assertArrayEquals(MineSweeper.mineSweeper(bombs2, 3, 4), result2);

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        int[][] result3 = {{1, 2, 2, 1, 0},{1, -1, -1, 2, 0},{1, 3, -1, 2, 0},{0, 1, 2, 2, 1},{0, 0, 1, -1, 1}};
        assertArrayEquals(MineSweeper.mineSweeper(bombs3, 5, 5), result3);
    }
}