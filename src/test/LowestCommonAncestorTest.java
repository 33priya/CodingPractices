package test;

import implementation.LowestCommonAncestor;
import junit.framework.TestCase;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LowestCommonAncestorTest extends TestCase {

    public void testLCA() {
        HashMap<Integer, int[]> mapping1 = new HashMap<>();
        int[] childrenA = {1, 2};
        int[] childrenB = {3, 4};
        int[] childrenC = {5, 6};
        mapping1.put(0, childrenA);
        mapping1.put(1, childrenB);
        mapping1.put(2, childrenC);

        LowestCommonAncestor.Node head1 = LowestCommonAncestor.createTree(mapping1, 0);
        // This tree is:
        // head1 = 0
        //        / \
        //       1   2
        //      /\   /\
        //     3  4 5  6


        HashMap<Integer, int[]> mapping2 = new HashMap<>();
        int[] childrenD = {1, 4};
        int[] childrenE = {3, 8};
        int[] childrenF = {9, 2};
        int[] childrenG = {6, 7};
        mapping2.put(5, childrenD);
        mapping2.put(1, childrenE);
        mapping2.put(4, childrenF);
        mapping2.put(3, childrenG);

        LowestCommonAncestor.Node head2 = LowestCommonAncestor.createTree(mapping2, 5);
        // This tree is:
        //  head2 = 5
        //        /   \
        //       1     4
        //      /\    / \
        //     3  8  9  2
        //    /\
        //   6  7

        assertEquals(LowestCommonAncestor.lca(head1, 1, 5), new Integer(0));
        assertEquals(LowestCommonAncestor.lca(head1, 3, 1), new Integer(1));
        assertEquals(LowestCommonAncestor.lca(head1, 1, 4), new Integer(1));
        assertEquals(LowestCommonAncestor.lca(head1, 0, 5), new Integer(0));
        assertEquals(LowestCommonAncestor.lca(head2, 4, 7), new Integer(5));
        assertEquals(LowestCommonAncestor.lca(head2, 3, 3), new Integer(3));
        assertEquals(LowestCommonAncestor.lca(head2, 8, 7), new Integer(1));
        assertEquals(LowestCommonAncestor.lca(head2, 3, 0), null);
    }
}