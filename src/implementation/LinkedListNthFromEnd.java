package implementation;

public class LinkedListNthFromEnd {

    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static Integer nthFromEnd(Node head, int n) {
        Node left = head;
        Node right = head;

        for (int i = 0; i < n; ++i) {
            if (right == null) {
                return null;
            }

            right = right.next;
        }

        while (right != null) {
            right = right.next;
            left = left.next;
        }

        return left != null ? left.data : null;
    }
}
