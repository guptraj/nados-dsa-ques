public class Main {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) this.data=data;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void printSingleChild(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right != null)
            System.out.println(root.right);
        if (root.left != null && root.right == null)
            System.out.println(root.left);
        printSingleChild(root.left);    
        printSingleChild(root.right);    
    }
}
