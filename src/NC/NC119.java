package NC;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NC119 {
        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> res  = new ArrayList<>();
            int len = input.length;
            if(len <  k || k == 0){
                return res;
            }
            // java优先队列默认是小顶堆，我们要设置为大顶堆
            // 这里用的lambda表达式实现比较器接口
            Queue<Integer> pq = new PriorityQueue<>(k,(a, b)->(b-a));
            for(int i = 0; i < len; i++){
                // 队列没满时，需要加满
                if(pq.size() < k){
                    pq.add(input[i]);
                }else{
                    // 队列满了即i>=k时，需要开始判断，当前值小于堆顶时需要加入队列
                    if(input[i] < pq.peek()){
                        pq.poll();
                        pq.add(input[i]);
                    }
                }
            }
            res.addAll(pq);
            return res;
    }
}
