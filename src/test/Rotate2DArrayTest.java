package test;

import implementation.Rotate2DArray;
import junit.framework.TestCase;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Rotate2DArrayTest extends TestCase {

    public void test2DArrayRotation() {
        int a1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result1 = {{7, 4, 1},{8, 5, 2},{9, 6, 3}};
        Assert.assertArrayEquals(Rotate2DArray.rotate(a1, 3), result1);

        int a2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] result2 = {{13, 9, 5, 1},{14, 10, 6, 2},{15, 11, 7, 3},{16, 12, 8, 4}};
        assertArrayEquals(Rotate2DArray.rotate(a2, 4), result2);
    }
}