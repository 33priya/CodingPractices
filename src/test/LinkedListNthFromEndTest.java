package test;

import implementation.LinkedListNthFromEnd;
import junit.framework.TestCase;

import static org.junit.Assert.*;

public class LinkedListNthFromEndTest extends TestCase {

    public void testNthFromEnd() {
        LinkedListNthFromEnd.Node current = new LinkedListNthFromEnd.Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new LinkedListNthFromEnd.Node(i, current);
        }
        LinkedListNthFromEnd.Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)
        assertEquals(LinkedListNthFromEnd.nthFromEnd(head, 1), new Integer(1));
        assertEquals(LinkedListNthFromEnd.nthFromEnd(head, 5), new Integer(5));


        LinkedListNthFromEnd.Node current2 = new LinkedListNthFromEnd.Node(4, null);
        for (int i = 3; i > 0; i--) {
            current2 = new LinkedListNthFromEnd.Node(i, current2);
        }

        LinkedListNthFromEnd.Node head2 = current2;
        // head2 = 1 -> 2 -> 3 -> 4 -> (null)
        assertEquals(LinkedListNthFromEnd.nthFromEnd(head2, 2), new Integer(3));
        assertEquals(LinkedListNthFromEnd.nthFromEnd(head2, 4), new Integer(1));
        assertEquals(LinkedListNthFromEnd.nthFromEnd(head2, 5), null);

        //head = (null)
        assertEquals(LinkedListNthFromEnd.nthFromEnd(null, 1), null);
    }
}