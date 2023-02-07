import java.util.LinkedList;
import java.util.Queue;

public class q5006 {

    public int q5006(int n, int k) {
        int answer=0;

        Queue<Integer> Q = new LinkedList<>();


        for (int i = 1; i <= n; i++) Q.offer(i);

        while (!Q.isEmpty()) {
            for (int i = 1; i < k; i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size()==1) answer=Q.poll();
        }




        return answer;
    }

}
