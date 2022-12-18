import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        int [] arr = {90,76,45,35,22,1,9,34,76};
        
        // by default min priority Queue
        // by Collections.reverseOrder() it becomes max pq

        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr)
        {
            pq.add(ele);
        }
        while(pq.size()!=0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
