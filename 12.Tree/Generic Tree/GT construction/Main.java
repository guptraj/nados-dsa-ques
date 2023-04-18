public class Main {
    class Node{
        int data;
        ArrayList<Integer> children = new ArrayList<>();
        Node(){};
        Node (int data){
            this.data= data;
        }
    }
    public static Node GTConstruction(int [] arr){
        Stack<Node> st = new stack<>();
        Node root = null;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1) st.pop();
            else{
                Node child = new Node(arr[i]);
                if(st.size()>0){
                    st.peek().children.add(arr[i]);
                }
                else root=child;
                st.push(child);
            }
        }
        return root;

    }
}
