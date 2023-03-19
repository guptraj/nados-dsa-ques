import java.util.*;

public class Main{
    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state= state;
        }
    }
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val= val;
        }
        Node(int val,Node left,Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static void binaryTreeCons(Integer [] arr){
        Stack<Pair> st = new Stack<>();
        Node root = new Node (arr[0]);
        st.push(new Pair(root,1));
        int idx =1;
        while(st.size()!=0){
            Pair topPair=st.peek();
            if(topPair.state ==1){
                topPair.state++;
                if(arr[idx] != null)
                {
                    Node leftChild = new Node(arr[idx]);
                    topPair.node.left=leftChild;
                    st.push(new Pair(leftChild,1));
                }
                idx++;
            }
            else if(topPair.state ==2){
                topPair.state++;
                if(arr[idx] != null)
                {
                    Node rightChild = new Node(arr[idx]);
                    topPair.node.right=rightChild;
                    st.push(new Pair(rightChild,1));
                }
                idx++;
            }
            else{
                st.pop();
            }
            
        }
        System.out.println("Done");
    }
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in); 
        Integer [] arr = {1, 2, 4, null ,null ,5, null, null, 3, 6, null, null, 7, null, null };
        binaryTreeCons(arr);
    }
}