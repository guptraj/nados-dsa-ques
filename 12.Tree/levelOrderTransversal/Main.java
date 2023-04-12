import java.util.Queue;

import org.w3c.dom.Node;

public class Main {
    // to print in same line
    public static void levelOrder(Node root) {
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while (qu.size() > 0) {
            Node top = qu.remove();
            System.out.print(top.data + " ");
            if (root.left != null)
                qu.add(root.left);
            if (root.right != null)
                qu.add(root.right);
        }

    }
    
    // to print each level in next line
    public static void levelOrder(Node root) {
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while (qu.size() > 0) {
            Node top = qu.remove();
            if (top == null) {
                System.out.println();
                qu.add(null);
            }
            System.out.print(top.data + " ");
            if (root.left != null)
                qu.add(root.left);
            if (root.right != null)
                qu.add(root.right);
        }

    }
}
