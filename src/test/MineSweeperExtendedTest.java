package test;

import implementation.MineSweeperExtended;
import junit.framework.TestCase;
import org.junit.Assert;

import static org.junit.Assert.*;

public class MineSweeperExtendedTest extends TestCase {
    public void testMineSweeperExtended() {
        int[][] field1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, -1, 1, 0}};
        int[][] result11 = {{0, 0, 0, 0, 0},{0, 1, 1, 1, 0},{0, 1, -1, 1, 0}};
        Assert.assertArrayEquals(MineSweeperExtended.click(field1, 3, 5, 2, 2), result11);
        int[][] result12 = {{-2, -2, -2, -2, -2},{-2, 1, 1, 1, -2},{-2, 1, -1, 1, -2}};
        assertArrayEquals(MineSweeperExtended.click(field1, 3, 5, 1, 4), result12);

        int[][] field2 = {{-1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, -1}};
        int[][] result21 = {{-1, 1, 0, 0},{1, 1, 0, 0},{0, 0, 1, 1},{0, 0, 1, -1}};
        assertArrayEquals(MineSweeperExtended.click(field2, 4, 4, 0, 1), result21);

        int[][] result22 = {{-1, 1, -2, -2},{1, 1, -2, -2},{-2, -2, 1, 1},{-2, -2, 1, -1}};
        assertArrayEquals(MineSweeperExtended.click(field2, 4, 4, 1, 3), result22);
    }
}