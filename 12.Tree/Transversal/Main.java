import java.util.Stack;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void display(Node root) {
        System.out.println("Pre Order");
        preOrder(root);
        System.out.println("In Order");
        inOrder(root);
        System.out.println("Post Order");
        postOrder(root);
    }

    public static void btConst(Integer [] arr) {
        Stack<Pair> st = new Stack<>();
        Node root=new Node(arr[0]);
        st.push(new Pair(root, 1));
        int idx = 1;
        while (st.size() != 0) {
            Pair peekPair = st.peek();
            if (peekPair.state == 1) {
                if (arr[idx] != null) {
                    Node leftChild = new Node(arr[idx]);
                    st.push(new Pair(leftChild, 1));
                    peekPair.node.left = leftChild;
                }
                peekPair.state++;
                idx++;
            } else if (peekPair.state == 2) {
                if (arr[idx] != null) {
                    Node rightChild = new Node(arr[idx]);
                    st.push(new Pair(rightChild, 1));
                    peekPair.node.left = rightChild;
                }
                peekPair.state++;
                idx++;
            } else {
                st.pop();
            }

        }
        display(root);
    }
    
    public static void main(String[] args) {
        Integer [] arr = { 1, 2, 4, null, null, 5, null, null, 3, 6, null, null, 7, null, null };
        btConst(arr);
    }
}
