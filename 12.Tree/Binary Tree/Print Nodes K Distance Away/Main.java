import java.io.*;
import java.util.*;
import javax.swing.tree.TreeNode;

public class Main {

  public static class Node {

    int data;
    Node left;
    Node right;

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

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static ArrayList<Node> nodeToRoot(Node root, int data) {
    if (root == null) return new ArrayList<>();
    if (root.data == data) {
      ArrayList<Node> Ans = new ArrayList<>();
      Ans.add(root);
      return Ans;
    }
    ArrayList<Node> leftAns = nodeToRoot(root.left, data);
    if (leftAns.size() > 0) {
      leftAns.add(root);
      return leftAns;
    }
    ArrayList<Node> rightAns = nodeToRoot(root.right, data);
    if (rightAns.size() > 0) {
      rightAns.add(root);
      return rightAns;
    }
    return new ArrayList<>();
  }

  public static void kLevelDown(Node root, int k, Node blocker) {
    if (root == null || root == blocker) return;
    if (k == 0) {
      System.out.println(root.data);
      return;
    }
    kLevelDown(root.left, k - 1, blocker);
    kLevelDown(root.right, k - 1, blocker);
  }

  public static void printKNodesFar(Node root, int data, int k) {
    ArrayList<Node> path = nodeToRoot(root, data);
    Node blocker = null;
    for (int i = 0; i < path.size(); i++) {
      Node node = path.get(i);
      kLevelDown(node, k - i, blocker);
      blocker = node;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    int data = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    printKNodesFar(root, data, k);
  }
}
