package implementation;

import java.util.HashMap;

public class BST {

    public static class Node {
        private int data;
        private Node left;
        private Node right;

        Node (int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Node createTree(HashMap<Integer, int[]> mapping, int headValue) {
        Node head = new Node(headValue, null, null);
        HashMap<Integer, Node> nodes = new HashMap<>();
        nodes.put(headValue, head);
        for(Integer key : mapping.keySet()) {
            int[] value = mapping.get(key);
            Node leftChild = new Node(value[0], null, null);
            Node rightChild = new Node(value[1], null, null);
            nodes.put(value[0], leftChild);
            nodes.put(value[1], rightChild);
        }
        for(Integer key : mapping.keySet()) {
            int[] value = mapping.get(key);
            nodes.get(key).left = nodes.get(value[0]);
            nodes.get(key).right = nodes.get(value[1]);
        }
        return head;
    }

    public static boolean isBST(Node root) {
        return isBST(root, null, null);
    }

    static boolean isBST(Node node, Integer lowerLimit, Integer upperLimit) {
        if (lowerLimit != null && node.data < lowerLimit) return false;
        if (upperLimit != null &&  node.data > upperLimit) return false;

        boolean isLeftBST = true;
        boolean isRightBST = true;

        if (node.left != null) {
            isLeftBST = isBST(node.left, lowerLimit, node.data);
        }

        if (isLeftBST && node.right != null) {
            isRightBST = isBST(node.right, node.data, upperLimit);
        }

        return isLeftBST && isRightBST;
    }
}
