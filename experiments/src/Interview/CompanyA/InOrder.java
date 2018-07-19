package Interview.CompanyA;

public class InOrder {
    /**
     * In Order traversal of a tree
     */

    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }
}
