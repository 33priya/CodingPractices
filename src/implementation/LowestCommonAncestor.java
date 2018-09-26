package implementation;

import java.util.HashMap;
import java.util.Stack;

public class LowestCommonAncestor {

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

    public static Integer lca(Node root, int j, int k) {
        Stack<Node> pathToJ = pathToX(root, j);
        Stack<Node> pathToK = pathToX(root, k);
        if (pathToJ == null || pathToK == null) {
            return null;
        }

        Node lcaToReturn = null;

        while (!pathToJ.isEmpty() && !pathToK.isEmpty()) {
            Node jPop = pathToJ.pop();
            Node kPop = pathToK.pop();
            if (jPop == kPop) {
                lcaToReturn = jPop;
            } else {
                break;
            }
        }
        return lcaToReturn != null ? lcaToReturn.data : null;
    }

    static Stack<Node> pathToX(Node root, int x) {
        if (root == null) return null;

        if (root.data == x) {
            Stack<Node> path = new Stack<>();
            path.push(root);
            return path;
        }

        Stack<Node> leftPath = pathToX(root.left, x);
        if (leftPath != null) {
            leftPath.push(root);
            return leftPath;
        }

        Stack<Node> rightPath = pathToX(root.right, x);
        if (rightPath != null) {
            rightPath.push(root);
            return rightPath;
        }

        return null;
    }
}
